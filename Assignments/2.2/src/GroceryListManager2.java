import java.util.HashMap;
import java.util.Map;

public class GroceryListManager2 {
    private HashMap<String, Double> groceryList = new HashMap<>();

    public void addItem(String item, double cost) {
        groceryList.put(item, cost);
    }

    public double calculateTotalCost() {
        double total = 0.0;
        for (double cost : groceryList.values()) {
            total += cost;
        }
        return total;
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

    public void displayList(){
        int number = 1;
        for(Map.Entry<String, Double> entry : groceryList.entrySet()){
            System.out.println(number + "." + entry.getKey() + " - $" + entry.getValue());
            number++;
        }
        System.out.println();
    }

    public boolean checkItem(String item){
        return groceryList.containsKey(item);
    }

    public static void main(String[] args) {
        GroceryListManager2 groceryListManager = new GroceryListManager2();
        groceryListManager.addItem("Apple", 2.0);
        groceryListManager.addItem("Milk", 2.5);
        groceryListManager.addItem("Bread", 1.5);
        System.out.println("Grocery List:");
        groceryListManager.displayList();
        System.out.println("Total cost of grocery list: $" + groceryListManager.calculateTotalCost());
        System.out.println();
        System.out.println("Is \"Milk\" in the grocery list? " + groceryListManager.checkItem("Milk"));
        System.out.println();
        groceryListManager.removeItem("Milk");
        System.out.println("Updated grocery List:");
        groceryListManager.displayList();
        System.out.println("Total cost of grocery list: $" + groceryListManager.calculateTotalCost());
    }
}
