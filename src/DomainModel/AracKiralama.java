
package DomainModel;


public class AracKiralama {
    private String kiralamaID;
    private Musteri musteri;
    private Sube alisSube;
    private Sube teslimSube;
    private Tarih alisTarih;
    private Tarih teslimTarih;
    private Arac arac;
    private double toplamTutar;
    private Odeme odeme;
    private boolean onay;
    private static int numOfInstance = 1;   //Auto increment

    public AracKiralama(Musteri musteri, Sube alisSube, Sube teslimSube, Tarih alisTarih, Tarih teslimTarih) {
        this.kiralamaID = Integer.toString(numOfInstance++);
        this.musteri = musteri;
        this.alisSube = alisSube;
        this.teslimSube = teslimSube;
        this.alisTarih = alisTarih;
        this.teslimTarih = teslimTarih;
    }
    
    public AracKiralama(Musteri musteri) {
        this.musteri = musteri;
    }
    
    public void hesaplaToplamTutar() {
        int toplamGun = Tarih.fark(alisTarih, teslimTarih) + 1;
        toplamTutar = Integer.parseInt(arac.getKiraBedeli()) * toplamGun;
    }
    
    public void odemeYap(String kartNO, String CVV2, String sonKullanma) {
        odeme = new Odeme(kartNO, CVV2, sonKullanma, toplamTutar);
        odeme.dogrula();
        onay = odeme.isOnay();
    }

    public Sube getAlisSube() {
        return alisSube;
    }

    public void setAlisSube(Sube alisSube) {
        this.alisSube = alisSube;
    }

    public Sube getTeslimSube() {
        return teslimSube;
    }

    public void setTeslimSube(Sube teslimSube) {
        this.teslimSube = teslimSube;
    }

    public Tarih getAlisTarih() {
        return alisTarih;
    }

    public void setAlisTarih(Tarih alisTarih) {
        this.alisTarih = alisTarih;
    }

    public Tarih getTeslimTarih() {
        return teslimTarih;
    }

    public void setTeslimTarih(Tarih teslimTarih) {
        this.teslimTarih = teslimTarih;
    }

    public Arac getArac() {
        return arac;
    }

    public void setArac(Arac arac) {
        this.arac = arac;
    }

    public String getKiralamaID() {
        return kiralamaID;
    }

    public Musteri getMusteri() {
        return musteri;
    }

    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
    }

    public double getToplamTutar() {
        return toplamTutar;
    }

    public boolean isOnay() {
        return onay;
    }
    
    
    
}
