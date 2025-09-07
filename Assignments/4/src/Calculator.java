public class Calculator {
    private int Value;

    public Calculator() {
        this.Value = 0;
    }

    public void reset() {
        this.Value = 0;
    }

    // Adds an integer to the calculator
    public void add(int number) {
        this.Value += number;
    }

    public double getValue() {
        return this.Value;
    }

    public  static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(5);
        calculator.add(10);
        System.out.println("Current Value: " + calculator.getValue()); // Should print 15
        calculator.reset();
        System.out.println("Value after reset: " + calculator.getValue()); // Should print
    }
}
