import java.util.ArrayList;

public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addItem(String item){
        groceryList.add(item);
    }

    public void removeItem(String item){
        if (groceryList.contains(item)){
            System.out.println("Removing \"" + item + "\" from the list...");
            groceryList.remove(item);
            System.out.println();
        } else {
            System.out.println("Item does not exist in the list...");
            System.out.println();
        }
    }

    public void displayList(){
        for(int i = 0; i < groceryList.size(); i++){
            System.out.println((i+1) + "." + groceryList.get(i));
        }
        System.out.println();
    }

    public boolean checkItem(String item){
        return groceryList.contains(item);
    }

    public static void main(String[] args) {
        GroceryListManager groceryListManager = new GroceryListManager();
        groceryListManager.addItem("Apple");
        groceryListManager.addItem("Milk");
        groceryListManager.addItem("Bread");
        System.out.println("Grocery List:");
        groceryListManager.displayList();
        System.out.println("Is \"Milk\" in the grocery list? " + groceryListManager.checkItem("Milk"));
        System.out.println();
        groceryListManager.removeItem("Milk");
        System.out.println("Updated grocery List:");
        groceryListManager.displayList();
    }

    public void addItem(String apple, double v) {
    }
}
