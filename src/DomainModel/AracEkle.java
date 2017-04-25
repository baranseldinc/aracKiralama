package DomainModel;

public class AracEkle {

    private String aracID;
    private String marka;
    private String model;
    private String kiraBedeli;
    private String plaka;
    private boolean kampanya;
    private Arac arac;

    public AracEkle(String aracID, String marka, String model, String kiraBedeli, String plaka, boolean kampanya) {
        this.aracID = aracID;
        this.marka = marka;
        this.model = model;
        this.kiraBedeli = kiraBedeli;
        this.plaka = plaka;
        this.kampanya = kampanya;
        create();
    }

    public void create() {
        arac = new Arac(aracID, marka, model, kiraBedeli, plaka, kampanya);
    }

    public Arac getArac() {
        return this.arac;
    }
}
