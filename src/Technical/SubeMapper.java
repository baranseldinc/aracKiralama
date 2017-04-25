

package Technical;

import DomainModel.Register;
import DomainModel.Sube;
import UserInterface.MainCenter;

public class SubeMapper implements IMapper{
    Register register = MainCenter.register;

    @Override
    public Object get(String OID) {
        return register.subeCatalog.get(OID);
    }

    @Override
    public void put(String OID, Object obj) {
        register.subeCatalog.put((Sube) obj);
    }

}
