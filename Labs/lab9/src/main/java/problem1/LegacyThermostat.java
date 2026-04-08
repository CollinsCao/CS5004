package problem1;

public class LegacyThermostat {
    private boolean active;
    private int currentTemp;

    public LegacyThermostat() {
        this.active = false;
        this.currentTemp = 72;
    }

    public void activate() {
        active = true;
        System.out.println("LegacyThermostat activated.");
    }

    public void deactivate() {
        active = false;
        System.out.println("LegacyThermostat deactivated.");
    }

    public int getCurrentTemp() {
        return currentTemp;
    }

    public boolean isActive() {
        return active;
    }
}
