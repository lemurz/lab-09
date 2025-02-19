public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        order.addFlavor(Menu.FLAVORS.get("Chocolate Fudge"));
        order.addFlavor(Menu.FLAVORS.get("Pistachio Delight"));
        order.addTopping(Menu.TOPPINGS.get("Sprinkles"));
        order.setContainer(new GlassJar());

        InvoiceGenerator invoice = new TextInvoice(order);
        invoice.generateInvoice(order);

    }
}