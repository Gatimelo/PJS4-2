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
}
