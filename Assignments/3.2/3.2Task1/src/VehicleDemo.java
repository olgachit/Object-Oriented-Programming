interface Vehicle {
    void start();

    void stop();

    void getInfo();
}

class Car implements Vehicle {
    private String fuel;
    private String colour;

    public Car(String fuel, String colour) {
        this.fuel = fuel;
        this.colour = colour;
    }

    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stoping...");
    }

    @Override
    public void getInfo() {
        System.out.println("Car information:\n" + "Type: Car\n" + "Fuel: " + fuel + "\n" + "Color: " + colour);
    }
}

class Motorcycle implements Vehicle {
    private String fuel;
    private String colour;

    public Motorcycle(String fuel, String colour) {
        this.fuel = fuel;
        this.colour = colour;
    }

    @Override
    public void start() {
        System.out.println("Motorcycle is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle is stoping...");
    }

    @Override
    public void getInfo() {
        System.out.println("Motorcycle information:\n" + "Type: Motorcycle\n" + "Fuel: " + fuel + "\n" + "Color: " + colour);
    }
}

class Bus implements Vehicle {
    private String fuel;
    private int capacity;

    public Bus(String fuel, int capacity) {
        this.fuel = fuel;
        this.capacity = capacity;
    }

    @Override
    public void start() {
        System.out.println("Bus is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Bus is stoping...");
    }

    @Override
    public void getInfo() {
        System.out.println("Bus information:\n" + "Type: Bus\n" + "Fuel: " + fuel + "\n" + "Capacity: " + capacity + " passengers");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car("Petrol", "Red");
        Motorcycle motorcycle = new Motorcycle("Gasoline", "Black");
        Bus bus = new Bus("Diesel", 40);

        car.start();
        car.stop();
        car.getInfo();
        System.out.println();
        motorcycle.start();
        motorcycle.stop();
        motorcycle.getInfo();
        System.out.println();
        bus.start();
        bus.stop();
        bus.getInfo();
    }
}
