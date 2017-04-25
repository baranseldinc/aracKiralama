
package rentcar;

import DomainModel.Musteri;
import DomainModel.Register;
import DomainModel.SubeMuduru;

public class DolumYap {
    Register register;
    
    public DolumYap(Register register) {
        this.register = register;
        mudurDoldur();
        subeDoldur();
        araclariDoldur();
        musteriDoldur();
    }
    
    public void mudurDoldur() {
        SubeMuduru s;
        s = new SubeMuduru();s.setMudurAdi("Baransel");s.setMudurSoyadi("DİNÇ");s.setMudurID("baran");s.setParola("baran");register.mudurCatalog.getMudurler().add(s);
        s = new SubeMuduru();s.setMudurAdi("Şahin");s.setMudurSoyadi("Ataman");s.setMudurID("sahin");s.setParola("sahin");register.mudurCatalog.put(s);
        s = new SubeMuduru();s.setMudurAdi("Veli");s.setMudurSoyadi("Tekin");s.setMudurID("veli");s.setParola("veli");register.mudurCatalog.put(s);
    }
    
    public void subeDoldur() {
        register.yeniSubeAcma("1", "Ankara Şubesi", register.mudurCatalog.get("baran"));register.mudurCatalog.get("baran").setSube(register.subeCatalog.get("1"));
        register.yeniSubeAcma("2", "İstanbul Şubesi", register.mudurCatalog.get("sahin"));register.mudurCatalog.get("sahin").setSube(register.subeCatalog.get("2"));
        register.yeniSubeAcma("3", "İzmir Şubesi", register.mudurCatalog.get("veli"));register.mudurCatalog.get("veli").setSube(register.subeCatalog.get("3"));
        register.yeniSubeAcma("4", "Çanakkale Şubesi", register.mudurCatalog.get("baran"));register.mudurCatalog.get("baran").setSube(register.subeCatalog.get("4"));
    }
    
    public void araclariDoldur() {
        register.yeniAracKaydi("1", "Renault", "Fluence", "80", "34-AA-030", register.subeCatalog.get("1"));
        register.yeniAracKaydi("2", "Fiat", "Palio", "70", "34-EZ-010", register.subeCatalog.get("1"));
        register.yeniAracKaydi("3", "Nissan", "Almera", "70", "34-AD-66", register.subeCatalog.get("1"));
        register.yeniAracKaydi("4", "Renault", "Toros", "10", "06-AA-130", register.subeCatalog.get("2"));
        register.yeniAracKaydi("5", "Toyota", "Avensis", "75", "34-BB-005", register.subeCatalog.get("2"));
        register.yeniAracKaydi("6", "Wolksvagen", "Passat", "100", "30-AA-030", register.subeCatalog.get("3"));
        register.yeniAracKaydi("7", "Nissan", "Primera", "80", "35-AA-035", register.subeCatalog.get("3"));
        register.yeniAracKaydi("8", "Ford", "Focus", "85", "17-AA-017", register.subeCatalog.get("3"));
        register.yeniAracKaydi("9", "Hyundai", "Era", "60", "17-ZZ-040", register.subeCatalog.get("4"));
        register.yeniAracKaydi("10", "Dacia", "Lodgy", "120", "17-ZZ-041", register.subeCatalog.get("4"));
        register.yeniAracKaydi("11", "Dacia", "Duster 4X2", "270", "34-ZZ-041", register.subeCatalog.get("4"));
        register.yeniAracKaydi("12", "Peugeot", "301", "185", "06-ZZ-041", register.subeCatalog.get("4"));
        register.yeniAracKaydi("13", "Opel", "Corsa", "120", "35-EE-041", register.subeCatalog.get("2"));
        register.yeniAracKaydi("14", "Citroen", "C5", "139", "34-DD-041", register.subeCatalog.get("2"));
        register.yeniAracKaydi("15", "Seat", "Toledo", "150", "17-FD-041", register.subeCatalog.get("2"));
    }
    
    public void musteriDoldur() {
        Musteri m;
        m = new Musteri();m.setIsim("Baransel");m.setSoyisim("Dinç");m.setMusteriID("baranseldinc");m.setParola("123456");register.musteriCatalog.put(m);
        m = new Musteri();m.setIsim("Şahin");m.setSoyisim("Ataman");m.setMusteriID("sahinataman");m.setParola("123456");register.musteriCatalog.put(m);
        m = new Musteri();m.setIsim("Sinan");m.setSoyisim("Can");m.setMusteriID("1");m.setParola("1");register.musteriCatalog.put(m);
    }
}
