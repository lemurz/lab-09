import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Flavor> flavors = new ArrayList<>();
    private List<Topping> toppings = new ArrayList<>();
    private Container container;

    public void addFlavor(Flavor flavor){
        flavors.add(flavor);
    }

    public void removeFlavor(Flavor flavor){
        flavors.remove(flavor);
    }

    public void addTopping(Topping topping){
        toppings.add(topping);
    }

    public void removeTopping(Topping topping){
        toppings.remove(topping);
    }

    public void setContainer(Container container){
        this.container = container;
    }

    public List<Flavor> getFlavors(){
        return flavors;
    }

    public List<Topping> getToppings(){
        return toppings;
    }

    public Container getContainer(){
        return container;
    }
}
