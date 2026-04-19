import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Filters vehicles based on their manufacturing year.
 */
public class OlderVehiclesFilter {
    private List<Vehicle> vehicles = new ArrayList<>();

    /**
     * Constructs an OlderVehiclesFilter with a list of vehicles.
     *
     * @param vehicles the list of vehicles
     */
    public OlderVehiclesFilter(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    /**
     * Constructs an OlderVehiclesFilter with three vehicles.
     *
     * @param vehicle1 first vehicle
     * @param vehicle2 second vehicle
     * @param vehicle3 third vehicle
     */
    public OlderVehiclesFilter(Vehicle vehicle1, Vehicle vehicle2, Vehicle vehicle3) {
        this.vehicles.add(vehicle1);
        this.vehicles.add(vehicle2);
        this.vehicles.add(vehicle3);
    }

    /**
     * Returns the make, model, and year of all vehicles manufactured before 1999.
     *
     * @return a list of strings describing older vehicles
     */
    public List<String> filterOlderVehilces() {
        return vehicles.stream()
                .filter(v -> v.getYear() < 1999)
                .map(v -> v.getMake() + " " + v.getModel() + " " + v.getYear())
                .collect(Collectors.toList());
    }
}