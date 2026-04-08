package problem1;

public class LegacyThermostatAdapter implements SmartDevice {
    private final LegacyThermostat legacyThermostat;

    public LegacyThermostatAdapter(LegacyThermostat legacyThermostat) {
        this.legacyThermostat = legacyThermostat;
    }

    @Override
    public void turnOn() {
        legacyThermostat.activate();
    }

    @Override
    public void turnOff() {
        legacyThermostat.deactivate();
    }

    @Override
    public String getStatus() {
        return "LegacyThermostat status: "
                + (legacyThermostat.isActive() ? "ON" : "OFF")
                + ", current temperature = "
                + legacyThermostat.getCurrentTemp() + "F";
    }
}
