
package DomainModel;

import java.util.ArrayList;
import rentcar.DolumYap;


public class KiralamaCatalog {
    private ArrayList<AracKiralama> kiralamalar = new ArrayList<>();

    public ArrayList<AracKiralama> getKiralamalar() {
        return kiralamalar;
    }

    public void setKiralamalar(ArrayList<AracKiralama> kiralamalar) {
        this.kiralamalar = kiralamalar;
    }
    
    public void put(AracKiralama ak) {
        kiralamalar.add(ak);
    }
    public AracKiralama get(String kiralamaID){
        AracKiralama ak = null;
        for (AracKiralama kiralamalar1 : kiralamalar) {
            if (kiralamalar1.getKiralamaID().equals(kiralamaID)) {
                ak = kiralamalar1;
            }
        }
        return ak;
    }
    
    public ArrayList<AracKiralama> getTeslimSubeID(String subeID) {
        ArrayList<AracKiralama> liste = new ArrayList<>();
        for(int i = 0;i<kiralamalar.size();i++) {
            if(kiralamalar.get(i).getTeslimSube().getSubeID().equals(subeID)) {
                liste.add(kiralamalar.get(i));
            }
        }
        return liste;
    }
    
    public ArrayList<AracKiralama> getTeslimSubeID(String subeID, ArrayList<AracKiralama> gelenListe) {
        ArrayList<AracKiralama> liste = new ArrayList<>();
        for(int i = 0;i<gelenListe.size();i++) {
            if(gelenListe.get(i).getTeslimSube().getSubeID().equals(subeID)||
                    gelenListe.get(i).getAlisSube().getSubeAdi().equals(subeID)) {
                liste.add(gelenListe.get(i));
            }
        }
        return liste;
    }
    
    public ArrayList<AracKiralama> dahaOncekiKayitlar(Tarih alisTarih) {
        ArrayList<AracKiralama> liste = new ArrayList<>();
        for(int i = 0;i<kiralamalar.size();i++) {
            Tarih teslimTarih = kiralamalar.get(i).getTeslimTarih();
            if(Tarih.fark(teslimTarih, alisTarih) > 0) {
                liste.add(kiralamalar.get(i));
            }
        }
        return liste;
    }
    public static void main(String[] args) {
        Register register = new Sistem().register;
        new DolumYap(register);
        register.yeniKiralamaBaslat(null, register.subeCatalog.get("1"), register.subeCatalog.get("1"), new Tarih(27, 5, 2016), new Tarih(29, 5, 2016));
        register.aracSec(register.aracCatalog.get("1"));
        register.odemeYap();
        register.kiralamaBitir();
        register.yeniKiralamaBaslat(null, register.subeCatalog.get("2"), register.subeCatalog.get("2"), new Tarih(3, 6, 2016), new Tarih(15, 6, 2016));
        register.aracSec(register.aracCatalog.get("4"));
        register.odemeYap();
        register.kiralamaBitir();
        
        System.out.println(register.kiralamaCatalog.getKiralamalar().size());
        System.out.println(register.kiralamaCatalog.getTeslimSubeID("1").size());
        ArrayList<AracKiralama> oncekiKayitlar = register.kiralamaCatalog.dahaOncekiKayitlar(new Tarih(28, 5, 2016));
        System.out.println(oncekiKayitlar.size());
        System.out.println(register.kiralamaCatalog.getTeslimSubeID("1", oncekiKayitlar).size());
        
    }

}
