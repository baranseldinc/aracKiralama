

package Technical;

import DomainModel.Arac;
import DomainModel.Register;
import UserInterface.MainCenter;


public class AracMapper implements IMapper{
    Register register = MainCenter.register;

    @Override
    public Object get(String OID) {
        return register.aracCatalog.get(OID);
        
    }

    @Override
    public void put(String OID, Object obj) {
        register.aracCatalog.put((Arac) obj);
    }

}
