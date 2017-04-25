package DomainModel;

public class Arac {

    private String aracID;
    private String marka;
    private String model;
    private String kiraBedeli;
    private String plaka;
    private boolean kampanya;

    public Arac(String aracID, String marka, String model, String kiraBedeli, String plaka, boolean kampanya) {
        this.aracID = aracID;
        this.marka = marka;
        this.model = model;
        this.kiraBedeli = kiraBedeli;
        this.plaka = plaka;
        this.kampanya = kampanya;
    }

    
    public String getAracID() {
        return aracID;
    }

    public void setAracID(String aracID) {
        this.aracID = aracID;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getKiraBedeli() {
        return kiraBedeli;
    }

    public void setKiraBedeli(String kiraBedeli) {
        this.kiraBedeli = kiraBedeli;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isKampanya() {
        return kampanya;
    }

    public void setKampanya(boolean kampanya) {
        this.kampanya = kampanya;
    }

}
