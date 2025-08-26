public class BicycleTest {
    public static void main(String[] args) {
        // main() knows both the Person and Bicycle objects, because main() creates both of them
        Person  benzino;
        Bicycle bike;

        benzino = new Person("Enzio", "Benzino", 1982); // this object needs to be created first
        bike    = new Bicycle(benzino, "Tunturi", 5, "Viuh");
        bike.drive();
    }
}

