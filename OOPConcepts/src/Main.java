public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Item item1 = new Item("Croissants", 10);
        Item item2 = new Item("Burgers", 5);
        Fruit fruit = new Fruit("Apple", 5, "Fuji");
        Weapon weapon = new Weapon("Sword", 7, 25, "Melee");

        inventory.addItem(item1);
        inventory.addItem(item2);
        inventory.addItem(fruit);
        inventory.addItem(weapon);

        inventory.displayInventory();

        System.out.println("\nStar this Repo :)");
    }
}

