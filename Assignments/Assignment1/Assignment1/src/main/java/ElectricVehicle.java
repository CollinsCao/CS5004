
/**
 * Represents an electric vehicle.
 */

public class ElectricVehicle {

    private String name;
    private double batterySize;
    private double stateOfCharge;
    private double defaultEfficiency;
    private double currentEfficiency;

    /**
     * Constructs an ElectricVehicle with the given properties.
     */

    public ElectricVehicle(String name,
                           double batterySize,
                           double stateOfCharge,
                           double defaultEfficiency){
        if (name == null || name. isEmpty()) {
            this.name = "unknown EV";
        } else {
            this.name = name;
        }

        this.batterySize = clamp(batterySize, 10.0, 150.0);
        this.defaultEfficiency = clamp(defaultEfficiency, 0.5, 4.5);
        this.stateOfCharge = clamp(stateOfCharge, 0.15, 1.0);

        this.currentEfficiency = this.defaultEfficiency;

    }

    /**
     * Clamps a value to the given range.
     *
     * @param value the value to clamp
     * @param min the minimum allowed value
     * @param max the maximum allowed value
     * @return the clamped value
     */
    private double clamp(double value, double min, double max) {
        if (value < min) {
            return min;
        }
        if (value > max) {
            return max;
        }
        return value;
    }

    /**
     * calculates the driving range of the electric vehicle.
     */
    public double range() {
        return currentEfficiency * stateOfCharge * batterySize;
    }

    /**
     * Updates the current efficiency based on temperature.
     */
    public void updateEfficiency(double currentTemp) {

        if (currentTemp >= 65.0 && currentTemp <= 77.0) {
            currentEfficiency = defaultEfficiency;
        }
        else if (currentTemp > 77.0) {
            currentEfficiency = defaultEfficiency * 0.85;
        }
        else {
            double degreesBelow = 65.0 - currentTemp;

            if (degreesBelow > 50.0) {
                degreesBelow = 50.0;
            }
            double efficiencyFactor = (100.0 - degreesBelow) / 100.0;
            currentEfficiency = defaultEfficiency * efficiencyFactor;

        }

    }

    /**
     * Returns the current efficiency (not the default efficiency).
     */
    public double getEfficiency() {
        return currentEfficiency;
    }

    /**
     * Returns the battery size.
     */
    public double getBatterySize() {
        return batterySize;
    }

    /**
     * Return the current state of charge.
     */
    public double getStateOfCharge() {
        return stateOfCharge;
    }

    /**
     * Return the name of the electric vehicle.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the state of charge, clamped to valid range.
     *
     * @param stateOfCharge the new state of charge
     */
    public void setStateOfCharge(double stateOfCharge) {
        this.stateOfCharge = clamp(stateOfCharge, 0.15, 1.0);
    }

    /**
     * Returns a string representation of the electric vehicle.
     *
     * @return a formatted string describing the vehicle
     */
    @Override
    public String toString() {
        return name
                + " SOC: "
                + String.format("%.1f", stateOfCharge * 100)
                + "% Range (miles): "
                + String.format("%.1f", range());
    }
}

