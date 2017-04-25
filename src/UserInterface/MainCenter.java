
package UserInterface;

import DomainModel.Sistem;

public class MainCenter {
    public static Sistem sistem = new Sistem();
    public static DomainModel.Register register = sistem.register;
}
