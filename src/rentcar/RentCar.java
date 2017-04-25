package rentcar;

import UserInterface.AnaEkran;
import UserInterface.MainCenter;

public class RentCar implements Runnable {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new RentCar());
    }

    @Override
    public void run() {
        new DolumYap(MainCenter.register);
        new AnaEkran().setVisible(true);
    }

}
