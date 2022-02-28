public class Hamburger {
    private final double price;
    private double addition1Price;
    private double addition2Price;
    private double addition3Price;
    private double addition4Price;

    public Hamburger (String name, String meat, double price, String breadRollType) {
        this.price = price;
        System.out.println(name + " hamburger on " + breadRollType + " roll" + " with " + meat + ", price is " + this.price);
    }

    public void addHamburgerAddition1(String addition1Name, double price) {
        this.addition1Price = price;
        System.out.println("Added " + addition1Name + " for an extra " + this.addition1Price);
    }

    public void addHamburgerAddition2(String addition2Name, double price) {
        this.addition2Price = price;
        System.out.println("Added " + addition2Name + " for an extra " + this.addition2Price);
    }

    public void addHamburgerAddition3(String addition3Name, double price) {
        this.addition3Price = price;
        System.out.println("Added " + addition3Name + " for an extra " + this.addition3Price);
    }

    public void addHamburgerAddition4(String addition4Name, double price) {
        this.addition4Price = price;
        System.out.println("Added " + addition4Name + " for an extra " + this.addition4Price);
    }

    public double itemizeHamburger () {
       return this.price + this.addition1Price +
               this.addition2Price + this.addition3Price + this.addition4Price;
    }

}
