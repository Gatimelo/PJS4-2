package persistant;

import lib.Article;
import lib.Association;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class data {

    // classe mono-instance : l'unique instance est connue de la bibliotheque
    // via une injection de d�pendance dans son bloc static
    // Jean-Fran�ois Brette 01/01/2018
    static {
        // injection dynamique de la d�pendance dans le package stable mediatek2021
    }

    //établie la connexion avec la base de donnée
    //return Connection
    public Connection connexion(){
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet mediatek", "root", "root");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    @Override
    public List<Article> articles() {
        Connection con = connexion();
        List<Article> articles = new ArrayList();
        try {
            PreparedStatement requeteStatique = null;
            requeteStatique = con.prepareStatement("SELECT * FROM ARTICLE WHERE visible=1");
            ResultSet tableResultat = null;
            tableResultat = requeteStatique.executeQuery();
            while (tableResultat.next()) {
                int num = tableResultat.getInt("id");
                String auteur = tableResultat.getString("auteur");
                String titre = tableResultat.getString("titre");
                String date = tableResultat.getString("date");
                String nomAsso = tableResultat.getString("nomAssociation");
                String html = tableResultat.getString("html");//String builder
                Blob resume = tableResultat.getBlob("resume");
                Association association = getAsso(nomAsso);
                if (association != null) {
                    Article article = new Article(num, auteur, titre, date, html, resume, association);
                } else {
                    Article article = new Article(num, auteur, titre, date, html, resume);
                    articles.add(article);
                }
            }
            return articles;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
        //trierArticle(articles);
    }

    public Association getAsso(String nomAsso) {
        Connection con = connexion();
        try {
            PreparedStatement requeteStatique;
            requeteStatique = con.prepareStatement("SELECT * FROM ASSOCIATION WHERE nomAssociation=?");
            requeteStatique.setString(1, nomAsso);
            ResultSet tableResultat;
            tableResultat = requeteStatique.executeQuery();
            if (tableResultat.next()) {
                Association asso = new Association(tableResultat.getInt("id"), nomAsso, tableResultat.getString("mailAssociation"), tableResultat.getString("telAssociation"), tableResultat.getString("ville"));
                return asso;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

        // renvoie la liste de tous les documents de la biblioth�que
        @Override
        public List<Document> catalogue(int type) {
            Connection con = connexion();
            List<Document> catalogue = new ArrayList<>();
            try {
                // exécution de la requète
                PreparedStatement requeteStatique = null;
                requeteStatique = con.prepareStatement("SELECT * FROM DOCUMENT where type=?");
                requeteStatique.setInt(1, type);
                ResultSet tableResultat = null;
                tableResultat = requeteStatique.executeQuery();
                while(tableResultat.next()) {
                    int num = tableResultat.getInt("num");

                    String titre = tableResultat.getString("titre");
                    String auteur = tableResultat.getString("auteur");
                    int anneePublication = tableResultat.getInt("anneePublication");
                    String dateAjout = tableResultat.getString("dateAjout");
                    Document doc = new Document() {
                        @Override
                        public Object[] data() {
                            return new Object[] {
                                    num, type, titre, auteur, anneePublication, dateAjout
                            };
                        };
                    };
                    catalogue.add(doc);
                }
                return catalogue;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
        }

        // va r�cup�rer le User dans la BD et le renvoie
        // si pas trouv�, renvoie null
        @Override
        public Utilisateur getUser(String login, String password){
            Connection con = connexion();
            try {
                // exécution de la requète
                PreparedStatement requeteStatique = null;
                requeteStatique = con.prepareStatement(
                        "SELECT * FROM UTILISATEUR WHERE login=?");

                requeteStatique.setString(1,login);
                ResultSet tableResultat = null;
                tableResultat = requeteStatique.executeQuery();

                // affichage du résultat
                if (!tableResultat.next()){
                    con.close();
                    return null;
                } else {
                    if (!(tableResultat.getString("password").equals(password))) {
                        con.close();
                        return null;
                    } else {
                        System.out.println(tableResultat.getString("login"));
                        System.out.println(tableResultat.getString("password"));
                        Utilisateur user = new Utilisateur() {
                            @Override
                            public String login() {
                                return login;
                            }

                            @Override
                            public String password() {
                                return password;
                            }

                            @Override
                            public Object[] data() {
                                return new Object[] {
                                        login,password
                                };
                            }
                        };
                        con.close();
                        return user;
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
        }

        // va r�cup�rer le document de num�ro numDocument dans la BD
        // et le renvoie
        // si pas trouv�, renvoie null
        @Override
        public Document getDocument(int numDocument) {
            Connection con = connexion();


            try {
                PreparedStatement requeteStatique = null;
                requeteStatique = con.prepareStatement(
                        "SELECT * FROM DOCUMENT WHERE num=?");
                requeteStatique.setInt(1,numDocument);
                ResultSet resultat = requeteStatique.executeQuery();
                if (!resultat.next()) return null;
                int num = resultat.getInt(1);
                int type = resultat.getInt(2);
                String titre = resultat.getString(3);
                String auteur = resultat.getString(4);
                int anneePublication = resultat.getInt(5);
                String dateAjout = resultat.getString(6);
                Boolean estEmprunte = resultat.getBoolean(7);

                Document doc = new Document() {
                    @Override
                    public Object[] data() {
                        return new Object[]{
                                //carac du doc ?
                                num,type,titre,auteur,anneePublication,dateAjout,estEmprunte
                        };
                    }
                };
                con.close();
                return doc;

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            return null;
        }

        // ajoute un nouveau document - exception � d�finir
        @Override
        public void newDocument(int type, Object... args) throws NewDocException {
            // args[0] -> le titre
            // args [1] --> l'auteur
            // etc en fonction du type et des infos optionnelles
            Connection con = connexion();
            try {
                PreparedStatement requeteStatique = null;
                requeteStatique = con.prepareStatement(
                        "INSERT INTO DOCUMENT(type, titre, auteur, anneePublication, dateAjout, estEmprunte) VALUES(?, ?, ?, ?, ?, ?)");
                requeteStatique.setInt(1, type);
                requeteStatique.setString(2, (String) args[0]);
                requeteStatique.setString(3, (String) args[1]);
                requeteStatique.setInt(4, (Integer) args[2]);
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                String now = LocalDateTime.now().format(dtf);
                requeteStatique.setObject(5, now);
                requeteStatique.setInt(6, 0);
                requeteStatique.executeUpdate();
            }
            catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }


        // supprime un document - exception � d�finir qui vérifie qu'il est pas emprunté ?
        @Override
        public void suppressDoc(int numDoc) throws SuppressException {
            Connection con = connexion();
            Document doc = getDocument(numDoc);
            if (doc == null) {
                throw new SuppressException("Ce document n'existe pas");
            } else if((boolean) doc.data()[6]) {
                throw new SuppressException("Ce document ne peut pas être supprimé car il est emprunté");
            } else {
                try {
                    PreparedStatement requeteStatique = null;
                    requeteStatique = con.prepareStatement(
                            "DELETE FROM DOCUMENT WHERE num=?");
                    requeteStatique.setInt(1, numDoc);
                    requeteStatique.executeUpdate();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }

    }

}
