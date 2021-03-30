package lib;

public class Mission {
    private int id, nbBenevolesMax;
    private String titre, dateDebut, dateFin, contenu;
    private Association association;

    public Mission(int id, String titre, String dateDebut, String dateFin, String contenu, int nbBenevolesMax) {
        this.id = id;
        this.titre = titre;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.contenu = contenu;
        this.nbBenevolesMax = nbBenevolesMax;
    }

    public Mission(int id, String titre, String dateDebut, String dateFin, String contenu, int nbBenevolesMax, Association association) {
        this(id, titre, dateDebut, dateFin, contenu, nbBenevolesMax);
        this.association = association;
    }

    public int getId() {
        return id;
    }

    public int getNbBenevolesMax() {
        return nbBenevolesMax;
    }

    public String getTitre() {
        return titre;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public String getDateFin() {
        return dateFin;
    }

    public String getContenu() {
        return contenu;
    }

    public Association getAssociation() {
        return association;
    }

    public void setNbBenevolesMax(int nbBenevolesMax) {
        this.nbBenevolesMax = nbBenevolesMax;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public void setAssociation(Association association) {
        this.association = association;
    }
}
