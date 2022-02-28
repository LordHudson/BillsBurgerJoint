public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat,  price, "Brown Rye");
    }

    public void addHealthyAddition1(String item, double price) {
        this.healthyExtra1Name = item;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String item, double price) {
        this.healthyExtra2Name = item;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double healthyPrice = super.itemizeHamburger();

        if(healthyExtra1Name != null){
            System.out.println("Added " + healthyExtra1Name + " for an extra " + healthyExtra1Price);
            healthyPrice += healthyExtra1Price;

        }
        if(healthyExtra2Name != null){
            System.out.println("Added " + healthyExtra2Name + " for an extra " + healthyExtra2Price);
            healthyPrice += healthyExtra2Price;
        }
        return healthyPrice;
    }
}
