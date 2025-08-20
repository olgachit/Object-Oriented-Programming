public class Radio {
    private double frequency;
    //…

    public double getFrequency() {
        return frequency;
    }
    public void setFrequency(double channel) {
        if (channel > 0)
            this.frequency = channel;
    }
    //…
}
