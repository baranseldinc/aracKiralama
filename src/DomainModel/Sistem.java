package DomainModel;

public class Sistem {

    private AracCatalog aracCatalog = new AracCatalog();
    private MusteriCatalog musteriCatalog = new MusteriCatalog();
    private SubeCatalog subeCatalog = new SubeCatalog();
    private SubeMudurCatalog mudurCatalog = new SubeMudurCatalog();
    private KiralamaCatalog kiralamaCatalog = new KiralamaCatalog();
    public Register register = new Register(musteriCatalog, aracCatalog, subeCatalog, mudurCatalog,kiralamaCatalog);
}
