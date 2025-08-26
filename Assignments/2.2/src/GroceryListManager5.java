import java.util.HashMap;
import java.util.Map;

class GroceryItem5 {
    String name;
    double cost;
    String category;
    int quantity;

    public GroceryItem5(String name, double cost, String category, int quantity) {
        this.name = name;
        this.cost = cost;
        this.category = category;
        this.quantity = quantity;
    }
}

public class GroceryListManager5 {
    private HashMap<String, GroceryItem5> groceryList = new HashMap<>();

    public void addItem(String name, double cost, String category, int quantity) {
        groceryList.put(name, new GroceryItem5(name, cost, category, quantity));
    }

    public double calculateTotalCost() {
        double total = 0.0;
        for (GroceryItem5 item : groceryList.values()) {
            total += item.cost * item.quantity;
        }
        return total;
    }

    public void displayByCategory(String category) {
        System.out.println("Items in category: " + category);
        int index = 1;
        for (GroceryItem5 item : groceryList.values()) {
            if (item.category.equalsIgnoreCase(category)) {
                System.out.println(index + ". " + item.name + " - $" + item.cost + " - Qty: " + item.quantity);
                index++;
            }
        }
        System.out.println();
    }

    public void displayAvailableItems() {
        System.out.println("Available Items:");
        int index = 1;
        for (GroceryItem5 item : groceryList.values()) {
            if (item.quantity > 0) {
                System.out.println(index + ". " + item.name + " - $" + item.cost + " - " + item.category + " - Qty: " + item.quantity);
                index++;
            }
        }
        System.out.println();
    }

    public void updateQuantity(String name, int newQuantity) {
        if (groceryList.containsKey(name)) {
            groceryList.get(name).quantity = newQuantity;
        } else {
            System.out.println("Item not found: " + name);
        }
    }

    public static void main(String[] args) {
        GroceryListManager5 groceryListManager = new GroceryListManager5();

        groceryListManager.addItem("Apple", 2.0, "Fruits", 5);
        groceryListManager.addItem("Milk", 2.5, "Dairy", 2);
        groceryListManager.addItem("Bread", 1.5, "Bakery", 3);
        groceryListManager.addItem("Cheese", 4.0, "Dairy", 1);

        System.out.println("Total cost: $" + groceryListManager.calculateTotalCost());

        groceryListManager.displayByCategory("Dairy");

        groceryListManager.displayAvailableItems();
        groceryListManager.updateQuantity("Milk", 0);
        groceryListManager.displayAvailableItems();
    }
}
