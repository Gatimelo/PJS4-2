package lib;

public class Association implements Utilisateur {
    private int id;
    private String mail, mdp, nomAsso, mailAsso, telAsso, ville;

    public Association(int id, String nomAsso, String mailAsso, String telAsso, String ville) {
        this.id = id;
        this.nomAsso = nomAsso;
        this.mailAsso = mailAsso;
        this.telAsso = telAsso;
        this.ville = ville;
    }

    public Association (int id, String mail, String mdp) {
        this.id = id;
        this.mail = mail;
        this.mdp = mdp;
    }

    public Association (int id, String mail, String mdp, String nomAsso, String mailAsso, String telAsso, String ville) {
        this(id, mail, mdp);
        this.nomAsso = nomAsso;
        this.mailAsso = mailAsso;
        this.telAsso = telAsso;
        this.ville = ville;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getMail() {
        return null;
    }

    @Override
    public String getMdp() {
        return null;
    }

    public String getNomAsso() {
        return nomAsso;
    }

    public String getMailAsso() {
        return mailAsso;
    }

    public String getTelAsso() {
        return telAsso;
    }

    public String getVille() {
        return ville;
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

    public void setNomAsso(String nomAsso) {
        this.nomAsso = nomAsso;
    }

    public void setMailAsso(String mailAsso) {
        this.mailAsso = mailAsso;
    }

    public void setTelAsso(String telAsso) {
        this.telAsso = telAsso;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
