public class SportsCar extends Car {

    public SportsCar(String typeName) {
        super(typeName);
    }

    @Override
    public void accelerate() {
        if (gasolineLevel > 0) {
            speed += 20;
            double newSpeed = getSpeed() + 20;
            gasolineLevel -= 5;
            if (gasolineLevel < 0) {
                gasolineLevel = 0;
            } else {
                speed = 0;
            }
        }
    }

    @Override
    public void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0) {
                speed = Math.max(0, getSpeed() - (amount * 2));
            } else {
                speed = 0;
            }
        }
    }
}
