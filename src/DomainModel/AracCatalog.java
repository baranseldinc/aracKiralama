package DomainModel;

import java.util.ArrayList;

public class AracCatalog {

    private ArrayList<Arac> araclar = new ArrayList<>();

    public void put(Arac arac) {
        araclar.add(arac);
    }

    public Arac get(String aracID) {
        Arac a = null;
        for (int i = 0; i < araclar.size(); i++) {
            a = araclar.get(i);
            if (a.getAracID().equals(aracID)) {
                return a;
            }
        }
        return a;
    }

    public ArrayList<Arac> getAraclar() {
        return araclar;
    }

    public void setAraclar(ArrayList<Arac> araclar) {
        this.araclar = araclar;
    }

}
