
package Technical;

import DomainModel.AracKiralama;
import DomainModel.Register;
import UserInterface.MainCenter;

public class KiralamaMapper implements IMapper{
    Register register = MainCenter.register;

    @Override
    public Object get(String OID) {
        return register.kiralamaCatalog.get(OID);
    }

    @Override
    public void put(String OID, Object obj) {
        register.kiralamaCatalog.put((AracKiralama) obj);
    }

}
