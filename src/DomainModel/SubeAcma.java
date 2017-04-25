package DomainModel;

public class SubeAcma {

    private String subeID;
    private String subeAdi;
    private SubeMuduru subeMuduru;
    private Sube sube;

    public SubeAcma(String subeID, String subeAdi, SubeMuduru subeMuduru) {
        this.subeID = subeID;
        this.subeAdi = subeAdi;
        this.subeMuduru = subeMuduru;
        create();
    }

    public void create() {
        sube = new Sube(subeID, subeAdi, subeMuduru);
    }

    public Sube getSube() {
        return sube;
    }
}
