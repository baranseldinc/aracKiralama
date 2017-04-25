package DomainModel;

import Technical.Facade;
import java.time.LocalDate;
import java.util.ArrayList;

public class Register {

    public AracCatalog aracCatalog;
    public SubeCatalog subeCatalog;
    public SubeMudurCatalog mudurCatalog;
    public KiralamaCatalog kiralamaCatalog;
    public MusteriCatalog musteriCatalog;
    private SubeAcma sa;
    private AracEkle aracEkle;
    private AracKiralama aracKiralama;
    private KampanyaDuzenleme kd;
    private Facade f;

    

    public Register(MusteriCatalog musteriCatalog, AracCatalog aracCatalog, SubeCatalog subeCatalog, SubeMudurCatalog mudurCatalog, KiralamaCatalog kiralamaCatalog) {
        this.musteriCatalog = musteriCatalog;
        this.aracCatalog = aracCatalog;
        this.subeCatalog = subeCatalog;
        this.mudurCatalog = mudurCatalog;
        this.kiralamaCatalog = kiralamaCatalog;
        f = new Facade();
    }
    
    public void kiralamaBaslat(Musteri m) {
        aracKiralama = new AracKiralama(m);
    }
    
    public AracKiralama yeniKiralamaBaslat(Musteri musteri, Sube alisSube, Sube teslimSube, Tarih alisTarih, Tarih teslimTarih) {
        aracKiralama = new AracKiralama(musteri, alisSube, teslimSube, alisTarih, teslimTarih);
        return aracKiralama;
    }

    public ArrayList<Arac> araclariListele() {
        UygunAraclar uygunAraclar = new UygunAraclar(kiralamaCatalog);
        return uygunAraclar.araclariListele(aracKiralama.getAlisTarih(), aracKiralama.getTeslimTarih(), 
                aracKiralama.getAlisSube().getSubeID());
    }

    public Sube yeniSubeAcma(String subeID, String subeAdi, SubeMuduru subeMuduru) {
        sa = new SubeAcma(subeID, subeAdi, subeMuduru);
        subeCatalog.put(sa.getSube());
        return sa.getSube();
    }
    
    public Sube yeniSube(String subeID, String subeAdi, SubeMuduru subeMuduru) {
        sa = new SubeAcma(subeID, subeAdi, subeMuduru);
        return sa.getSube();
    }

    public void yeniAracKaydi(String aracID, String marka, String model, String kiraBedeli, String plaka, Sube sube) {
        aracEkle = new AracEkle(aracID, marka, model, kiraBedeli, plaka, false);
        aracCatalog.put(aracEkle.getArac());
        int yil = LocalDate.now().getYear();
        int ay = LocalDate.now().getMonthValue();
        int gun = LocalDate.now().getDayOfMonth();
        Tarih simdi = new Tarih(gun, ay, yil);
        AracKiralama ak = new AracKiralama(null, sube, sube, simdi, simdi);
        ak.setArac(aracEkle.getArac());
        kiralamaCatalog.put(ak);
    }
    
    public double hesaplaToplamTutar() {
        aracKiralama.hesaplaToplamTutar();
        return aracKiralama.getToplamTutar();
    }
    
    public void aracSec(Arac arac) {
        aracKiralama.setArac(arac);
    }
    
    public void odemeYap(/*String kartNo, double toplamTutar*/) {
        aracKiralama.odemeYap(null, null, null);
    }
    
    public void kiralamaBitir() {
        kiralamaCatalog.put(aracKiralama);
    }
    
    public void subeAcmaBitir() {
        subeCatalog.put(sa.getSube());
    }
    
    public AracKiralama getAracKiralama() {
        return aracKiralama;
    }
    public void kampanyaBaslat() {
        kd = new KampanyaDuzenleme();
    }
    
    public Object get(String OID, Object object) {
        return f.get(OID, object);
    }
    
    public void put(String OID, Object object) {
        f.put(OID, object);
    }

}
