import java.util.*;

class Item {
    String name;
    int quantity;

    Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    void display() {
        System.out.println(name + ": " + quantity);
    }
}

public class Main {
    public static void main(String[] args) {
        List<Item> inventory = new ArrayList<>();
        inventory.add(new Item("Apple", 10));
        inventory.add(new Item("Banana", 5));

        for (Item item : inventory) {
            item.display();
        }
    }
}
