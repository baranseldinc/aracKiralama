package DomainModel;

import java.util.ArrayList;

public class SubeCatalog {

    private ArrayList<Sube> subeler = new ArrayList<>();

    public Sube get(String subeID) {
        Sube s = null;
        for (int i = 0; i < subeler.size(); i++) {
            if (subeler.get(i).getSubeID().equals(subeID)) {
                s = subeler.get(i);
            }
        }
        return s;
    }

    public void put(String subeID, String adi, SubeMuduru subeMuduru) {
        Sube s = new Sube(subeID, subeID, subeMuduru);
        subeler.add(s);
    }
    
    public void put(Sube s) {
        subeler.add(s);
    }

    public ArrayList<Sube> getSubeler() {
        return subeler;
    }

    public void setSubeler(ArrayList<Sube> subeler) {
        this.subeler = subeler;
    }
}
