import java.util.HashMap;
import java.util.Map;

class GroceryItem {
    String name;
    double cost;
    String category;

    public GroceryItem(String name, double cost, String category) {
        this.name = name;
        this.cost = cost;
        this.category = category;
    }
}

public class GroceryListManager3 {
    private HashMap<String, GroceryItem> groceryList = new HashMap<>();

    public void addItem(String name, double cost, String category) {
        GroceryItem item = new GroceryItem(name, cost, category);
        groceryList.put(name, item);
    }

    public void removeItem(String item){
        if (groceryList.containsKey(item)){
            System.out.println("Removing \"" + item + "\" from the list...");
            groceryList.remove(item);
            System.out.println();
        } else {
            System.out.println("Item does not exist in the list...");
            System.out.println();
        }
    }

    public void displayByCategory(String category) {
        System.out.println("Items in category: " + category);
        int number = 1;
        for (GroceryItem item : groceryList.values()) {
            if (item.category.equalsIgnoreCase(category)) {
                System.out.println(number + ". " + item.name + " - $" + item.cost);
                number++;
            }
        }
        System.out.println();
    }


    public void displayList() {
        int number = 1;
        for (GroceryItem item : groceryList.values()) {
            System.out.println(number + ". " + item.name + " - $" + item.cost + " - " + item.category);
            number++;
        }
        System.out.println();
    }

    public boolean checkItem(String item){
        return groceryList.containsKey(item);
    }

    public static void main(String[] args) {
        GroceryListManager3 groceryListManager = new GroceryListManager3();
        groceryListManager.addItem("Apple", 2.0, "Fruits");
        groceryListManager.addItem("Milk", 2.5, "Dairy");
        groceryListManager.addItem("Bread", 1.5, "Bakery");
        System.out.println("Grocery List:");
        groceryListManager.displayList();
        System.out.println();
        groceryListManager.displayByCategory("Dairy");

    }
}
