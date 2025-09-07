This is a code for a calculator program

```
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
```

This code defines a simple Calculator class in Java that can add integers and reset its value. The class has a private variable Value to store the current number. The add method increases the value by a given integer, and the reset method sets it back to zero. The getValue method returns the current value as a double. The main method adds numbers, prints the result, resets, and prints result again
