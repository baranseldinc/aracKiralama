

package Technical;

import DomainModel.Musteri;
import DomainModel.Register;
import UserInterface.MainCenter;


public class MusteriMapper implements IMapper{
    Register register = MainCenter.register;

    @Override
    public Object get(String OID) {
        return register.musteriCatalog.getMusteri(OID);
    }

    @Override
    public void put(String OID, Object obj) {
        register.musteriCatalog.put((Musteri) obj);
    }

}
