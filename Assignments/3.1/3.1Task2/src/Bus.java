public class Bus extends Car {
    private int maxPassengers;
    private int currentPassengers;

    public Bus(String typeName, int maxPassengers) {
        super(typeName);
        this.maxPassengers = maxPassengers;
        this.currentPassengers = 0;
    }

    public void passengerEnter(int number) {
        if (number <= 0) return;
        int spaceLeft = maxPassengers - currentPassengers;
        if (number <= spaceLeft) {
            currentPassengers += number;
            System.out.println(number + " passengers entered. "+(maxPassengers - currentPassengers)+ " spots left");
        } else if (spaceLeft > 0) {
            currentPassengers = maxPassengers;
            System.out.println(spaceLeft+" passengers entered. Bus is now full");
        } else {
            System.out.println("Bus is full");
        }
    }

    public void passengerExit(int number) {
        if (number <= 0) return;
        if (currentPassengers - number >= 0) {
            currentPassengers -= number;
            System.out.println(number + " passengers exited. Current passengers: " + currentPassengers);
        } else {
            System.out.println(currentPassengers + " passengers exited. Bus is now empty.");
            currentPassengers = 0;
        }
    }

}
