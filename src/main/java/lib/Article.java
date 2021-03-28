package lib;

import java.io.File;
import java.sql.Blob;

public class Article {
    private int id;
    private String auteur, titre, date, contenu, resume;
    private Association association;

    public Article(int id, String auteur, String titre, String date, String contenu, String resume) {
        this.id = id;
        this.auteur= auteur;
        this.titre = titre;
        this.date = date;
        this.contenu = contenu;
        this.resume = resume;
    }

    public Article(int id, String auteur, String titre, String date, String contenu, String resume, Association association) {
        this(id, auteur, titre, date, contenu, resume);
        this.association = association;
    }

    public int getId() {
        return id;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getTitre() {
        return titre;
    }

    public String getDate() {
        return date;
    }

    public String getContenu() {
        return contenu;
    }

    public String getResume() {
        return resume;
    }

    public Association getAssociation() {
        return association;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public void setAssociation(Association association) {
        this.association = association;
    }
}
