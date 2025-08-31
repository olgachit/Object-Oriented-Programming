interface Vehicle {
    void start();

    void stop();

    String getInfo();
}

abstract class AbstractVehicle implements Vehicle {
    protected String type;
    protected String fuel;

    public AbstractVehicle(String type, String fuel) {
        this.type = type;
        this.fuel = fuel;
    }

    @Override
    public void start() {
        System.out.println(type + " is starting...");
    }

    @Override
    public void stop() {
        System.out.println(type + " is stopping...");
    }

    @Override
    public String getInfo() {
        return type + " Information:\n" + "Type: " + type + "\n" + "Fuel: " + fuel + "\n";
    }
}

class Car extends AbstractVehicle {
    private String colour;

    public Car(String fuel, String colour) {
        super("Car", fuel);
        this.colour = colour;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "Colour: " + colour;
    }
}

class Motorcycle extends AbstractVehicle {
    private String colour;

    public Motorcycle(String fuel, String colour) {
        super("Motorcycle", fuel);
        this.colour = colour;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "Colour: " + colour;
    }
}

class Bus extends AbstractVehicle {
    private int capacity;

    public Bus(String fuel, int capacity) {
        super("Bus", fuel);
        this.capacity = capacity;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "Capacity: " + capacity;
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car("Petrol", "Red");
        Motorcycle motorcycle = new Motorcycle("Gasoline", "Black");
        Bus bus = new Bus("Diesel", 40);

        car.start();
        car.stop();
        System.out.println(car.getInfo());
        System.out.println();
        motorcycle.start();
        motorcycle.stop();
        System.out.println(motorcycle.getInfo());
        System.out.println();
        bus.start();
        bus.stop();
        System.out.println(bus.getInfo());
    }
}
