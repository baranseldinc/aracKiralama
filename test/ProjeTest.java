/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DomainModel.Arac;
import DomainModel.Musteri;
import DomainModel.Register;
import DomainModel.Sistem;
import DomainModel.Sube;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class ProjeTest {
    static Sistem sistem = new Sistem();
    static Register register = sistem.register;
    static Arac arac = new Arac("100", "Toyota", "Corolla", "450", "34-aa-34", true);
    static Musteri musteri = new Musteri();
    static Sube sube = new Sube("250", "Elazığ Keban", null);
    
    
    public ProjeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @Before
    public void setUp() {
        musteri.setMusteriID("300");
        musteri.setIsim("Nazım");
        musteri.setSoyisim("Hikmet");
        musteri.setParola("332211");
        register.put(arac.getAracID(), arac);
        register.put(sube.getSubeID(), sube);
        register.put(musteri.getMusteriID(), musteri);
    }
    
    @Test
    public void musteriMapperTest() {
        Musteri testMusteri = (Musteri) register.get("300", Musteri.class);
        String isim = musteri.getIsim();
        String testIsim = testMusteri.getIsim();
        Assert.assertEquals(isim, testIsim);
    }
    
    @Test
    public void aracMapperTest() {
        Arac testArac = (Arac) register.get("100", Arac.class);
        String marka = arac.getMarka();
        String testMarka = testArac.getMarka();
        Assert.assertEquals(marka, testMarka);
    }
    
    @Test
    public void subeMapperTest() {
        Sube testSube = (Sube) register.get("250", Sube.class);
        String subeAdi = sube.getSubeAdi();
        String testSubeAdi = testSube.getSubeAdi();
        Assert.assertEquals(subeAdi, testSubeAdi);
    }

}
