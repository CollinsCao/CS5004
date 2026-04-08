package problem1;

public class SmartSpeaker implements SmartDevice {
    private boolean on;

    public SmartSpeaker() {
        this.on = false;
    }

    @Override
    public void turnOn() {
        on = true;
        System.out.println("SmartSpeaker is now ON.");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("SmartSpeaker is now OFF.");
    }

    @Override
    public String getStatus() {
        return "SmartSpeaker status: " + (on ? "ON" : "OFF");
    }
}
