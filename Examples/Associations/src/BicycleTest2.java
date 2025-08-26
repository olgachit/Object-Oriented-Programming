public class BicycleTest2 {
    public static void main(String[] args) {
        Person benzino;
        Bicycle tunturi, nopsa;

        benzino = new Person("Enzio", "benzino", 1982);
        tunturi = new Bicycle(benzino, "Tunturi", 5, "Viuh");
        nopsa = new Bicycle(benzino,"Nopsa", 3, "Ka...boom");
        benzino.drive(tunturi, 3);
        benzino.drive(nopsa, 2);
    }
}
