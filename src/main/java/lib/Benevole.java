package lib;

public class Benevole implements Utilisateur {
    int id;
    String mail, mdp, nomBenevole, prenomBenevole, telBenevole;

    public Benevole(int id, String mail, String mdp) {
        this.id = id;
        this.mail = mail;
        this.mdp = mdp;
    }

    public Benevole(int id, String mail, String mdp, String nomBenevole, String prenomBenevole) {
        this(id, mail, mdp);
        this.nomBenevole = nomBenevole;
        this.prenomBenevole = prenomBenevole;
    }

    public Benevole(int id, String mail, String mdp, String nomBenevole, String prenomBenevole, String telBenevole) {
        this(id, mail, mdp, nomBenevole, prenomBenevole);
        this.telBenevole = telBenevole;
    }


    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getMail() {
        return mail;
    }

    @Override
    public String getMdp() {
        return mdp;
    }


    public String getNomBenevole() {
        return nomBenevole;
    }

    public String getPrenomBenevole() {
        return prenomBenevole;
    }

    public String getTelBenevole() {
        return telBenevole;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public void setNomBenevole(String nomBenevole) {
        this.nomBenevole = nomBenevole;
    }

    public void setPrenomBenevole(String prenomBenevole) {
        this.prenomBenevole = prenomBenevole;
    }

    public void setTelBenevole(String telBenevole) {
        this.telBenevole = telBenevole;
    }
}
