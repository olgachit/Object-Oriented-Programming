public class CoffeeMaker {
    private boolean on;
    private String coffeeType;
    private int coffeeAmount;

    public CoffeeMaker() {
        on = false;
        coffeeType = "normal";
        coffeeAmount = 10;
    }

    public void pressOnOff() {
        on = !on;
    }

    public boolean isOn() {
        return on;
    }

    public void setCoffeeType(String type) {
        if (on && (type.equals("normal") || type.equals("espresso"))) {
        coffeeType = type;
        }
    }

    public String getCoffeeType() {
        return coffeeType;
    }

    public void setCoffeeAmount(int amount) {
        if (on && amount >= 10 && amount <= 80) {
            coffeeAmount = amount;
        }
    }

    public int getCoffeeAmount() {
        return coffeeAmount;
    }
}
