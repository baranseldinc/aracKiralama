package DomainModel;

import java.util.ArrayList;

public class SubeMudurCatalog {

    private ArrayList<SubeMuduru> mudurler = new ArrayList();

    public ArrayList<SubeMuduru> getMudurler() {
        return mudurler;
    }

    public void setMudurler(ArrayList<SubeMuduru> mudurler) {
        this.mudurler = mudurler;
    }

    public void put(SubeMuduru sm) {
        mudurler.add(sm);
    }

    public SubeMuduru get(String ID) {
        SubeMuduru sm = null;
        for (int i = 0; i < mudurler.size(); i++) {
            sm = mudurler.get(i);
            if (sm.getMudurID().equals(ID)) {
                return sm;
            }
        }
        return sm;
    }
}
