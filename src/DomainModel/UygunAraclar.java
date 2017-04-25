
package DomainModel;

import java.util.ArrayList;


public class UygunAraclar {
    KiralamaCatalog kiralamaCatalog;
    ArrayList<AracKiralama> kiraliklar;
    
    public UygunAraclar(KiralamaCatalog kiralamaCatalog) {
        this.kiralamaCatalog = kiralamaCatalog;   
    }

    public ArrayList<Arac> araclariListele(Tarih alisTarih, Tarih teslimTarih, String alisSubeID) {
        AracKiralama ak = new AracKiralama(null, null, null, alisTarih, teslimTarih);
        ArrayList<Arac>  araclar = new ArrayList<>();
        kiraliklar = kiralamaCatalog.getTeslimSubeID(alisSubeID);
        ArrayList<AracKiralama> cakismayanlar = new ArrayList<>();
        for(int i = 0;i<kiraliklar.size();i++) {
            if(!Tarih.cakisikMi(ak, kiraliklar.get(i))) {
                cakismayanlar.add(kiraliklar.get(i));
            }
        }
        for(int i = 0;i<cakismayanlar.size();i++) {
            if(cakismayanlar.get(i).getTeslimTarih().toplamKacGun() < alisTarih.toplamKacGun()) {
                if(!araclar.contains(cakismayanlar.get(i).getArac()))
                araclar.add(cakismayanlar.get(i).getArac());
            }
        }
        
        return araclar;
    }
    
    public ArrayList<Arac> listele (Tarih alisTarih, Tarih teslimTarih, String alisSubeID) {
        ArrayList<Arac>  araclar = new ArrayList<>();
        Arac a = null;
        ArrayList<AracKiralama> kiraliklar = kiralamaCatalog.getTeslimSubeID(alisSubeID, kiralamaCatalog.dahaOncekiKayitlar(alisTarih));
        for(int i = 0;i<kiraliklar.size();i++) {
            if(kiraliklar.get(i).getTeslimSube().getSubeID().equals(alisSubeID)) {
                a = kiraliklar.get(i).getArac();
                if(!araclar.contains(a)) araclar.add(a);
            }else {
                a = kiraliklar.get(i).getArac();
                if(araclar.contains(a)) araclar.remove(a);
            }
        }
        
        return araclar;
    }
    
    public ArrayList<Arac> listele2 (String alisSubeID, Tarih alisTarih) {
        ArrayList<Arac>  araclar = new ArrayList<>();
        ArrayList<AracKiralama> oncekiKayitlar = kiralamaCatalog.dahaOncekiKayitlar(alisTarih);
        for(int i = 0;i<oncekiKayitlar.size();i++) {
            AracKiralama ak = oncekiKayitlar.get(i);
            String akAlisSube = ak.getAlisSube().getSubeID();
            String akTeslimSube = ak.getTeslimSube().getSubeID();
            Arac a = ak.getArac();
            if(akAlisSube.equals(alisSubeID)) {
                if(akTeslimSube.equals(alisSubeID)) {
                    if(!araclar.contains(a)) araclar.add(a);
                }else {
                    if(araclar.contains(a)) araclar.remove(a);
                }
            }else if(akTeslimSube.equals(alisSubeID)){
                if(!araclar.contains(a)) araclar.add(a);
            }
            
        }
        return araclar;
    }
    
}