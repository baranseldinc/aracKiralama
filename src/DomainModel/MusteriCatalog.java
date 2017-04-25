

package DomainModel;

import java.util.ArrayList;

public class MusteriCatalog {
    ArrayList<Musteri> musteriler = new ArrayList<>();
    
    public void put (Musteri m) {
        musteriler.add(m);
    }
    
    public Musteri getMusteri(String ID) {
        Musteri m = null;
        for(int i = 0;i<musteriler.size();i++) {
            if(ID.equals(musteriler.get(i).getMusteriID()))
                m = musteriler.get(i);
        }
        return m;
    }

}
