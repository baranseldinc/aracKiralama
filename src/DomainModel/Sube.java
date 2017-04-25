package DomainModel;

public class Sube {

    private String subeID;
    private String subeAdi;
    private SubeMuduru subeMuduru;

    public Sube(String subeID, String subeAdi, SubeMuduru subeMuduru) {
        this.subeID = subeID;
        this.subeAdi = subeAdi;
        this.subeMuduru = subeMuduru;
    }

    public String getSubeID() {
        return subeID;
    }

    public void setSubeID(String subeID) {
        this.subeID = subeID;
    }

    public String getSubeAdi() {
        return subeAdi;
    }

    public void setSubeAdi(String subeAdi) {
        this.subeAdi = subeAdi;
    }

    public SubeMuduru getSubeMuduru() {
        return subeMuduru;
    }

    public void setSubeMuduru(SubeMuduru subeMuduru) {
        this.subeMuduru = subeMuduru;
    }
}
