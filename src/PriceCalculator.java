public class PriceCalculator {
    private final double TAX_RATE = 0.08;
    private Order order;

    public PriceCalculator(Order order){
        this.order = order;
    }

    public double calculateSubtotal(Order order){

        double subtotal = order.getContainer().getPrice();

        for(Flavor flavor : order.getFlavors()){
            subtotal += flavor.getPrice();
        }

        for(Topping topping : order.getToppings()){
            subtotal += topping.getPrice();
        }

        return subtotal;
    }

    public double calculateTax(double subtotal){
        return subtotal * TAX_RATE;
    }

    public double calculateTotal(double subtotal, double tax){
        return subtotal + tax;
    }
}
