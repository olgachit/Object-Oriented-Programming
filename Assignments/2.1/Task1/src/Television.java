public class Television {
    private int channel;
    private boolean on;

    public Television() {
        this.channel = 0;
        this.on = false;
    }

    public boolean isOn() {
        return on;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void pressOnOff() {
        on = !on;
    }
}
