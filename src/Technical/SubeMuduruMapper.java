

package Technical;

import DomainModel.Register;
import DomainModel.SubeMuduru;
import UserInterface.MainCenter;


public class SubeMuduruMapper implements IMapper{
    Register register = MainCenter.register;

    @Override
    public Object get(String OID) {
        return register.mudurCatalog.get(OID);
    }

    @Override
    public void put(String OID, Object obj) {
        register.mudurCatalog.put((SubeMuduru) obj);
    }

}
