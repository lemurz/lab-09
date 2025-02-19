public class TextInvoice implements InvoiceGenerator{

    private PriceCalculator priceCalculator;

    public TextInvoice(Order order){
        this.priceCalculator = new PriceCalculator(order);
    }

    @Override
    public void generateInvoice(Order order){
        double subtotal = priceCalculator.calculateSubtotal(order);
        double tax = priceCalculator.calculateTax(subtotal);
        double total = priceCalculator.calculateTotal(subtotal, tax);

        System.out.println("Yogurt Shop Invoice");

        for (Flavor flavor : order.getFlavors()) {
            System.out.println(flavor.getName() + " - 1 scoop: $" + flavor.getPrice());
        }
        for (Topping topping : order.getToppings()) {
            System.out.println(topping.getName() + " - 1 time: $" + topping.getPrice());
        }
        System.out.println("Container: " + order.getContainer().getName());
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total Amount Due: $" + total);
    }
}
