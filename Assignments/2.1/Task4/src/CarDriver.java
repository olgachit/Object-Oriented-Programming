public class CarDriver {
    public static void main(String[] args) {
        Car myCar;

        myCar = new Car("Toyota Corolla",20,50);
        myCar.fillTank();

        for (int i = 0; i < 6; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        while (myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        myCar.setCruiseTargetSpeed(80);
        System.out.println("Target cruise speed set to " + myCar.getCruiseTargetSpeed() + " km/h");
        boolean cruiseOn = myCar.turnOnCruiseControl();
        if (cruiseOn) {
            System.out.println("Cruise control turned ON");
            System.out.println("Current speed: " + myCar.getSpeed() + " km/h");
        } else {
            System.out.println("Cruise control could not be activated");
        }

        myCar.turnOffCruiseControl();
        System.out.println("Cruise control turned OFF");
    }
}