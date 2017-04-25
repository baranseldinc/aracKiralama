package Technical;

import DomainModel.Arac;
import DomainModel.AracKiralama;
import DomainModel.Musteri;
import DomainModel.Sube;
import DomainModel.SubeMuduru;

public class Facade {

    IMapper mapper;

    public void getMapper(Object object) {

        if (object == Arac.class) {
            mapper = new AracMapper();
        } else if (object == AracKiralama.class) {
            mapper = new KiralamaMapper();
        } else if (object == Musteri.class) {
            mapper = new MusteriMapper();
        } else if (object == Sube.class) {
            mapper = new SubeMapper();
        } else if (object == SubeMuduru.class) {
            mapper = new SubeMuduruMapper();
        }
    }

    public Object get(String OID, Object object) {
        getMapper(object);
        return mapper.get(OID);
    }

    public void put(String OID, Object object) {
        getMapper(object.getClass());
        mapper.put(OID, object);
    }

}
