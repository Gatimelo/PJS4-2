package persistant;

import lib.*;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Data {

    private static Data instance = new Data();

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
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pjs4", "root", "");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        System.out.println("ouii");
        return con;
    }

    public static Data getInstance() {
        return instance;
    }

    public void creerArticle(String auteur, String titre, int id, String contenu, String resume) {
		PreparedStatement requete = null;
		Connection con = connexion();
		LocalDateTime actuelle = LocalDateTime.now();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String date = actuelle.format(dateFormat);
		try {
			requete = con.prepareStatement("INSERT INTO article values (?,?,?,?,?,?);");
			requete.setString(1, auteur);
			requete.setString(2, titre);
			requete.setString(3, date);
			requete.setInt(4, id);
			requete.setString(5, contenu);
			requete.setString(6, resume);
			requete.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (requete != null)
					requete.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
    
    public List<Article> getArticles() {
        Connection con = connexion();
        List<Article> articles = new ArrayList();
        try {
            PreparedStatement requeteStatique = null;
            requeteStatique = con.prepareStatement("SELECT * FROM ARTICLE");
            ResultSet tableResultat = null;
            tableResultat = requeteStatique.executeQuery();
            while (tableResultat.next()) {
                int num = tableResultat.getInt("idArticle");
                String auteur = tableResultat.getString("auteur");
                String titre = tableResultat.getString("titre");
                String date = tableResultat.getString("dateArticle");
                int idAsso = tableResultat.getInt("idAssociation");
                String contenu = tableResultat.getString("contenu");//String builder
                String resume = tableResultat.getString("resume");
                Association association = getAsso(idAsso);
                if (association != null) {
                    Article article = new Article(num, auteur, titre, date, contenu, resume, association);
                } else {
                    Article article = new Article(num, auteur, titre, date, contenu, resume);
                    articles.add(article);
                }
            }
            //articles = trierArticles(articles);
            return articles;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
    }

    public Article getArticle(int idArticle) {
        Connection con = connexion();
        try {
            PreparedStatement requeteStatique = null;
            requeteStatique = con.prepareStatement("SELECT * FROM ARTICLE WHERE idArticle=?");
            requeteStatique.setInt(1, idArticle);
            ResultSet tableResultat = requeteStatique.executeQuery();
            Article article = null;
            if (tableResultat.next()) {
                int num = tableResultat.getInt("idArticle");
                String auteur = tableResultat.getString("auteur");
                String titre = tableResultat.getString("titre");
                String date = tableResultat.getString("dateArticle");
                int idAsso = tableResultat.getInt("idAssociation");
                String contenu = tableResultat.getString("contenu");//String builder
                String resume = tableResultat.getString("resume");
                Association association = getAsso(idAsso);
                if (association != null) {
                    article = new Article(num, auteur, titre, date, contenu, resume, association);
                } else {
                    article = new Article(num, auteur, titre, date, contenu, resume);
                }
            }
            return article;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
    }

    public Association getAsso(int idAsso) {
        Connection con = connexion();
        try {
            PreparedStatement requeteStatique;
            requeteStatique = con.prepareStatement("SELECT * FROM ASSOCIATION WHERE idAssociation=?");
            requeteStatique.setInt(1, idAsso);
            ResultSet tableResultat;
            tableResultat = requeteStatique.executeQuery();
            if (tableResultat.next()) {
                Association asso = new Association(tableResultat.getInt("id"), tableResultat.getString("nomAssociation"), tableResultat.getString("mailAssociation"), tableResultat.getString("telAssociation"), tableResultat.getString("ville"));
                return asso;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public List<Mission> getMissions() {
        Connection con = connexion();
        List<Mission> missions = new ArrayList();
        try {
            PreparedStatement requeteStatique = null;
            requeteStatique = con.prepareStatement("SELECT * FROM ARTICLE");
            ResultSet tableResultat = null;
            tableResultat = requeteStatique.executeQuery();
            while (tableResultat.next()) {
                int num = tableResultat.getInt("id");
                String titre = tableResultat.getString("titreMission");
                String contenu = tableResultat.getString("contenuMission");
                String dateDebut = tableResultat.getString("dateDebut");
                String dateFin = tableResultat.getString("dateFin");
                int nbBenevolesMax = tableResultat.getInt("nbBenevolesMax");
                int idAsso = tableResultat.getInt("idAssociation");
                Association association = getAsso(idAsso);
                if (association != null) {
                    Mission mission = new Mission(num, titre, dateDebut, dateFin, contenu, nbBenevolesMax, association);
                } else {
                    Mission mission = new Mission(num, titre, dateDebut, dateFin, contenu, nbBenevolesMax);
                    missions.add(mission);
                }
            }
            return missions;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public Mission getMission(int idMission) {
        Connection con = connexion();
        try {
            PreparedStatement requeteStatique = null;
            requeteStatique = con.prepareStatement("SELECT * FROM MISSION WHERE idMission=?");
            requeteStatique.setInt(1, idMission);
            ResultSet tableResultat = requeteStatique.executeQuery();
            Mission mission = null;
            if (tableResultat.next()) {
                int num = tableResultat.getInt("idMission");
                String titre = tableResultat.getString("titreMission");
                String contenu = tableResultat.getString("contenuMission");
                String dateDebut = tableResultat.getString("dateDebut");
                String dateFin = tableResultat.getString("dateFin");
                int nbBenevolesMax = tableResultat.getInt("nbBenevolesMax");
                int idAsso = tableResultat.getInt("idAssociation");
                Association association = getAsso(idAsso);
                if (association != null) {
                    mission = new Mission(num, titre, dateDebut, dateFin, contenu, nbBenevolesMax, association);
                } else {
                    mission = new Mission(num, titre, dateDebut, dateFin, contenu, nbBenevolesMax);
                }
            }
            return mission;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return null;
        }
    }

    public Association getAsso(String mail, String mdp) throws SQLException {
        Connection con = connexion();
        try {
            // exécution de la requète
            PreparedStatement requeteStatique = null;
            requeteStatique = con.prepareStatement("SELECT * FROM association WHERE mailAssociation=?");
            requeteStatique.setString(1,mail);
            ResultSet tableResultat = requeteStatique.executeQuery();
            Association asso = null;

            // affichage du résultat
            if (!tableResultat.next()){
                con.close();
                return null;
            } else {
                if (!(tableResultat.getString("mdpAssociation").equals(mdp))) {
                    con.close();
                    return null;
                } else {
                    int id = tableResultat.getInt("idAssociation");
                    asso = new Association(id, mail, mdp);
                };
                con.close();
                return asso;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        con.close();
        return null;
    }

    public Benevole getBenevole(String mail, String mdp) throws SQLException {
        Connection con = connexion();
        try {
            // exécution de la requète
            PreparedStatement requeteStatique   = null;
            requeteStatique = con.prepareStatement("SELECT * FROM BENEVOLE WHERE mailBenevole=?");
            requeteStatique.setString(1,mail);
            ResultSet tableResultat = requeteStatique.executeQuery();
            Benevole benevole = null;

            // affichage du résultat
            if (!tableResultat.next()){
                con.close();
                return null;
            } else {
                if (!(tableResultat.getString("mdpAssociation").equals(mdp))) {
                    con.close();
                    return null;
                } else {
                    int id = tableResultat.getInt("idAssociation");
                    benevole = new Benevole(id, mail, mdp);
                };
                con.close();
                return benevole;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        con.close();
        return null;
    }

    /*
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

    }*/

}
