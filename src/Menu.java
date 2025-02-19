import java.util.HashMap;
import java.util.Map;

public class Menu {
    public static final Map<String, Flavor> FLAVORS = new HashMap<>();
    public static final Map<String, Topping> TOPPINGS = new HashMap<>();

    static{
        FLAVORS.put("Cookies and Cream", new Flavor("Cookies and Cream", 2.80));
        FLAVORS.put("Chocolate Fudge", new Flavor("Chocolate Fudge", 3.00));
        FLAVORS.put("Pistachio Delight", new Flavor("Pistachio Delight", 3.25));

        TOPPINGS.put("Sprinkles", new Topping("Sprinkles", 0.30));
        TOPPINGS.put("Mixed chopped nuts", new Topping("Mixed chopped nuts", 0.80));
        TOPPINGS.put("Crushed Gingerbread", new Topping("Crushed Gingerbread", 0.75));
        TOPPINGS.put("Fresh Strawberries", new Topping("Fresh Strawberries", 1.00));
    }
}
