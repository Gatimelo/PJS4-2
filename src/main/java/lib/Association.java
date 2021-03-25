package lib;

public class Association {
    private int id;
    private String nomAsso, mailAsso, telAsso, ville;

    public Association(int id, String nomAsso, String mailAsso, String telAsso, String ville) {
        this.id = id;
        this.nomAsso = nomAsso;
        this.mailAsso = mailAsso;
        this.telAsso = telAsso;
        this.ville = ville;
    }
}
