/* Define a class Car (convention capitalizes class names).
 * Car is public (as classes usually are, more on this later).
 */
public class Car {
    /* An object of class Car will have instance variables speed and gasolineLevel.
     * Both are private (they can not be accessed outside the class methods).
     * Keep instance variables private whenever possible.
     */
    private double speed;
    private double gasolineLevel;
    private String typeName;

    private boolean cruiseOn;
    private double cruiseTargetSpeed;
    private final double MIN_CRUISE_SPEED = 30;
    private final double MAX_CRUISE_SPEED = 180;

    /* This is the method (constructor) called when a new instance of Car is created (with new).
     * Constructors may also have arguments.
     */
    public Car(String typeName, double initialSpeed, double initialGasolineLevel) {
        speed = initialSpeed;
        gasolineLevel = initialGasolineLevel;
        this.typeName = typeName;   // this refers to the object itself.
        cruiseOn = false;
        cruiseTargetSpeed = 0;
        // The reference is useful if you want to use parameter names that are
        // identical to instance variable names (and for more, later on)
    }

    /* Implementations of some methods.
     * Note that methods refer to and change instance variable values.
     */
    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
        cruiseOn = false;
    }
    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
            cruiseOn = false;
    }
    void setCruiseTargetSpeed(double target) {
        this.cruiseTargetSpeed = target;
    }
    public double getCruiseTargetSpeed() {
        return cruiseTargetSpeed;
    }
    public boolean turnOnCruiseControl() {
        if (gasolineLevel <= 0) {
            cruiseOn = false;
            return false; // no fuel, cannot enable
        }
        if (cruiseTargetSpeed < MIN_CRUISE_SPEED || cruiseTargetSpeed > MAX_CRUISE_SPEED) {
            cruiseOn = false;
            return false; // target outside allowed range
        }

        cruiseOn = true;
        adjustToTargetSpeed();
        return true;
    }
    public void turnOffCruiseControl() {
        cruiseOn = false;
    }

    public boolean isCruiseOn() {
        return cruiseOn;
    }
    private void adjustToTargetSpeed() {
        if (!cruiseOn) return;

        if (gasolineLevel <= 0) {
            cruiseOn = false;
            speed = 0;
            return;
        }

        if (speed < cruiseTargetSpeed) {
            speed = cruiseTargetSpeed; // simulate acceleration to target
        } else if (speed > cruiseTargetSpeed) {
            speed = cruiseTargetSpeed; // simulate deceleration to target
        }
    }

    double getSpeed() {
        return speed;
    }
    String getTypeName() {
        return typeName;
    }
    void fillTank() {
        gasolineLevel = 100;
    }
    double getGasolineLevel() {
        return gasolineLevel;
    }
}