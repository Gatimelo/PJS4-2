package lib;

import java.io.File;
import java.sql.Blob;

public class Article {
    private int id;
    private String auteur, titre, date, html;
    private Blob resume;
    private Association association;

    public Article(int id, String auteur, String titre, String date, String html, Blob resume) {
        this.id = id;
        this.auteur= auteur;
        this.titre = titre;
        this.date = date;
        this.html = html;
        this.resume = resume;
    }

    public Article(int id, String auteur, String titre, String date, String html, Blob resume, Association association) {
        this(id, auteur, titre, date, html, resume);
        this.association = association;
    }
}
