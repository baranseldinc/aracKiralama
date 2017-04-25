package DomainModel;

public class Tarih {

    private int gun;
    private int ay;
    private int yil;

    public Tarih(int gun, int ay, int yil) {
        this.gun = gun;
        this.ay = ay;
        this.yil = yil;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public int getGun() {
        return gun;
    }

    public void setGun(int gun) {
        this.gun = gun;
    }

    public int getAy() {
        return ay;
    }

    public void setAy(int ay) {
        this.ay = ay;
    }

    public int aySiniri(int year, int month) {
        int sinir;
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            sinir = 30;
        } else if (month == 2 && year % 4 != 0) {
            sinir = 28;
        } else if (month == 2 && year % 4 == 0) {
            sinir = 29;
        } else {
            sinir = 31;
        }
        return sinir;
    }

    public void tarihArttir(int kacGun) {
        gun = gun + kacGun;
        while (gun > aySiniri(yil, ay)) {
            gun = gun - aySiniri(yil, ay);
            if (ay == 12) {
                yil++;
                ay = 1;
            } else {
                ay++;
            }
        }
    }
    
    public int toplamKacGun() {
        int gun = this.getYil()*365;
        Tarih sifir;
        do {
            sifir = new Tarih(0, 0, 0);
            sifir.tarihArttir(++gun);
        }while(!Tarih.esitMi(this, sifir));
        return gun;
    }

    public static boolean esitMi(Tarih t1, Tarih t2) {
        if (t1.getGun() == t2.getGun() && t1.getAy() == t2.getAy() && t1.getYil() == t2.getYil()) {
            return true;
        }
        return false;
    }

    public String tarihYaz() {
        String month = null;
        if (ay == 1) {
            month = "Ocak";
        } else if (ay == 2) {
            month = "Şubat";
        } else if (ay == 3) {
            month = "Mart";
        } else if (ay == 4) {
            month = "Nisan";
        } else if (ay == 5) {
            month = "Mayıs";
        } else if (ay == 6) {
            month = "Haziran";
        } else if (ay == 7) {
            month = "Temmuz";
        } else if (ay == 8) {
            month = "Ağustos";
        } else if (ay == 9) {
            month = "Eylül";
        } else if (ay == 10) {
            month = "Ekim";
        } else if (ay == 11) {
            month = "Kasım";
        } else if (ay == 12) {
            month = "Aralık";
        } else {
            month = "HATA";
        }
        
        String tarih = gun + "-" + month + "-" + yil;
        return tarih;
    }

    public static int fark(Tarih baslangic, Tarih bitis) {
        int fark = 0;
        fark = bitis.toplamKacGun() - baslangic.toplamKacGun();
        return fark;
    }
    
    public static boolean cakisikMi(AracKiralama ak1, AracKiralama ak2) {
        int baslangic1 = ak1.getAlisTarih().toplamKacGun();
        int bitis1 = ak1.getTeslimTarih().toplamKacGun();
        int baslangic2 = ak2.getAlisTarih().toplamKacGun();
        int bitis2 = ak2.getTeslimTarih().toplamKacGun();
        if(baslangic1 > bitis2) {
            return false;
        }else if(baslangic1 == bitis2) {
            return true;
        }else {
            if(bitis1 == baslangic2 || bitis1 > baslangic2) {
                return true;
            }else {
                return false;
            }
        }
    }

}
