package problem1;

public class SmartLight implements SmartDevice {
    private boolean on;

    public SmartLight() {
        this.on = false;
    }

    @Override
    public void turnOn() {
        on = true;
        System.out.println("SmartLight is now ON.");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("SmartLight is now OFF.");
    }

    @Override
    public String getStatus() {
        return "SmartLight status: " + (on ? "ON" : "OFF");
    }
}

