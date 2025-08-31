interface Vehicle {
    void start();
    void stop();
    String getInfo();
}

interface ElectricVehicle {
    void charge();
}

abstract class AbstractVehicle implements Vehicle, ElectricVehicle {
    protected String type;

    public AbstractVehicle(String type) {
        this.type = type;
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
    public void charge() {
        System.out.println("Not possible to charge " + type);
    }

    @Override
    public String getInfo() {
        return type + " Information:\n" + "Type: " + type + "\n";
    }
}

class Car extends AbstractVehicle {
    private String fuel;
    private String colour;

    public Car(String fuel, String colour) {
        super("Car");
        this.fuel = fuel;
        this.colour = colour;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "Fuel: " + fuel + "\n" + "Colour: " + colour;
    }
}

class Motorcycle extends AbstractVehicle {
    private String fuel;
    private String colour;

    public Motorcycle(String fuel, String colour) {
        super("Motorcycle");
        this.fuel = fuel;
        this.colour = colour;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "Fuel: " + fuel + "\n" + "Colour: " + colour;
    }
}

class Bus extends AbstractVehicle {
    private String fuel;
    private int capacity;

    public Bus(String fuel, int capacity) {
        super("Bus");
        this.fuel = fuel;
        this.capacity = capacity;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "Fuel: " + fuel + "\n" + "Capacity: " + capacity + " passengers";
    }
}

class ElectricCar extends AbstractVehicle {
    private String colour;
    private int battery;

    public ElectricCar(String colour, int battery) {
        super("Electric Car");
        this.colour = colour;
        this.battery = battery;
    }

    @Override
    public void charge() {
        if (battery == 100) {
            System.out.println("Electric Car is already fully charged.");
        } else {
            System.out.println("Electric Car is charging...");
            battery = 100;
        }
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "Colour: " + colour + "\n" + "Battery: " + battery + "%";
    }
}

class ElectricMotorcycle extends AbstractVehicle {
    private String colour;
    private int battery;

    public ElectricMotorcycle(String colour, int battery) {
        super("Electric Motorcycle");
        this.colour = colour;
        this.battery = battery;
    }

    @Override
    public void charge() {
        if (battery == 100) {
            System.out.println("Electric Motorcycle is already fully charged.");
        } else {
            System.out.println("Electric Motorcycle is charging...");
            battery = 100;
        }
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "Colour: " + colour + "\n" + "Battery: " + battery + "%";
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car("Petrol", "Red");
        Motorcycle motorcycle = new Motorcycle("Gasoline", "Black");
        Bus bus = new Bus("Diesel", 40);
        ElectricCar eCar = new ElectricCar("Blue", 80);
        ElectricMotorcycle eMotorcycle = new ElectricMotorcycle("White", 100);

        car.start();
        car.stop();
        car.charge();
        System.out.println(car.getInfo());
        System.out.println();

        motorcycle.start();
        motorcycle.stop();
        motorcycle.charge();
        System.out.println(motorcycle.getInfo());
        System.out.println();

        bus.start();
        bus.stop();
        bus.charge();
        System.out.println(bus.getInfo());
        System.out.println();

        eCar.start();
        eCar.stop();
        eCar.charge();
        System.out.println(eCar.getInfo());
        System.out.println();

        eMotorcycle.start();
        eMotorcycle.stop();
        eMotorcycle.charge();
        System.out.println(eMotorcycle.getInfo());
    }
}
