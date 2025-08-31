interface Vehicle {
    void start();
    void stop();
    String getInfo();
    String calculateFuelEfficiency();
}

interface ElectricVehicle {
    void charge();
}

abstract class AbstractVehicle implements Vehicle, ElectricVehicle {
    protected String type;
    protected double fuelEfficiency;

    public AbstractVehicle(String type, double fuelEfficiency) {
        this.type = type;
        this.fuelEfficiency = fuelEfficiency;
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

    public Car(String fuel, String colour, double fuelEfficiency) {
        super("Car", fuelEfficiency);
        this.fuel = fuel;
        this.colour = colour;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "Fuel: " + fuel + "\n" + "Colour: " + colour;
    }

    @Override
    public String calculateFuelEfficiency() {
        return "Fuel Efficiency: " + fuelEfficiency + " miles per gallon";
    }
}

class Motorcycle extends AbstractVehicle {
    private String fuel;
    private String colour;

    public Motorcycle(String fuel, String colour, double fuelEfficiency) {
        super("Motorcycle", fuelEfficiency);
        this.fuel = fuel;
        this.colour = colour;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "Fuel: " + fuel + "\n" + "Colour: " + colour;
    }

    @Override
    public String calculateFuelEfficiency() {
        return "Fuel Efficiency: " + fuelEfficiency + " litres per 100 km";
    }
}

class Bus extends AbstractVehicle {
    private String fuel;
    private int capacity;

    public Bus(String fuel, int capacity, double fuelEfficiency) {
        super("Bus", fuelEfficiency);
        this.fuel = fuel;
        this.capacity = capacity;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "Fuel: " + fuel + "\n" + "Capacity: " + capacity + " passengers";
    }

    @Override
    public String calculateFuelEfficiency() {
        return "Fuel Efficiency: " + fuelEfficiency + " miles per gallon";
    }
}

class ElectricCar extends AbstractVehicle {
    private String colour;
    private int battery;

    public ElectricCar(String colour, int battery, double fuelEfficiency) {
        super("Electric Car", fuelEfficiency);
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

    @Override
    public String calculateFuelEfficiency() {
        return "Energy Efficiency: " + fuelEfficiency + " kWh per 100 km";
    }
}

class ElectricMotorcycle extends AbstractVehicle {
    private String colour;
    private int battery;

    public ElectricMotorcycle(String colour, int battery, double fuelEfficiency) {
        super("Electric Motorcycle", fuelEfficiency);
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

    @Override
    public String calculateFuelEfficiency() {
        return "Energy Efficiency: " + fuelEfficiency + " kWh per 100 km";
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car("Petrol", "Red", 30.5);
        Motorcycle motorcycle = new Motorcycle("Gasoline", "Black", 4.2);
        Bus bus = new Bus("Diesel", 40, 8.0);
        ElectricCar eCar = new ElectricCar("Blue", 80, 18.5);
        ElectricMotorcycle eMotorcycle = new ElectricMotorcycle("White", 100, 12.0);

        car.start();
        car.stop();
        car.charge();
        System.out.println(car.getInfo());
        System.out.println(car.calculateFuelEfficiency());
        System.out.println();

        motorcycle.start();
        motorcycle.stop();
        motorcycle.charge();
        System.out.println(motorcycle.getInfo());
        System.out.println(motorcycle.calculateFuelEfficiency());
        System.out.println();

        bus.start();
        bus.stop();
        bus.charge();
        System.out.println(bus.getInfo());
        System.out.println(bus.calculateFuelEfficiency());
        System.out.println();

        eCar.start();
        eCar.stop();
        eCar.charge();
        System.out.println(eCar.getInfo());
        System.out.println(eCar.calculateFuelEfficiency());
        System.out.println();

        eMotorcycle.start();
        eMotorcycle.stop();
        eMotorcycle.charge();
        System.out.println(eMotorcycle.getInfo());
        System.out.println(eMotorcycle.calculateFuelEfficiency());
    }
}
