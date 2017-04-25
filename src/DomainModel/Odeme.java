
package DomainModel;

import java.util.Random;


public class Odeme {
    String kartNO;
    String CVV2;
    String sonKullanma;
    double toplamTutar;
    boolean onay;

    public Odeme(String kartNO, String CVV2, String sonKullanma, double toplamTutar) {
        this.kartNO = kartNO;
        this.CVV2 = CVV2;
        this.sonKullanma = sonKullanma;
        this.toplamTutar = toplamTutar;
    }
    
    public void dogrula() {
        Random rand = new Random();
        int random = rand.nextInt(5);
        if(random != 4) onay = true;
        else onay = false;
    }
    
    public boolean isOnay() {
        return onay;
    }

}
