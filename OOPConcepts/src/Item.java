public class Item {

    private String name;
    private int quantity;

    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item: {" +
                "name = '" + name + '\'' +
                ", quantity = " + quantity +
                '}';
    }
}

/*
private - can't be accessed outside the class
Use getters and setters

A class is a blueprint for creating objects

A constructor - special method to create objects.
 */
