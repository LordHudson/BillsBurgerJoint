public class DeluxeHamburger extends Hamburger{

    public DeluxeHamburger() {
        super("Deluxe", "Sausage & Bacon",  19.10, "White");
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double price) {
        System.out.println("Additional items not allowed");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double price) {
        System.out.println("Additional items not allowed");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double price) {
        System.out.println("Additional items not allowed");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double price) {
        System.out.println("Additional items not allowed");
    }
}
