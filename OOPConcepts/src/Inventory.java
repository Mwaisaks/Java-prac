import java.util.ArrayList;

public class Inventory {

    private ArrayList<Item> items;

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void displayInventory(){
        for (Item item : items){
            System.out.println(item);
        }
    }
}

/*
ArrayList - stores and manages groups of objects.
resizeable

Array - stores strings, int not objects
fixed

Polymorphism
Override and Overloading are elements of polymorphism
 */
