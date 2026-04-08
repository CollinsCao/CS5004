package problem1;

import java.util.ArrayList;
import java.util.List;

public class SmartHomeController {
    private static SmartHomeController instance;
    private final List<SmartDevice> devices;

    private SmartHomeController() {
        devices = new ArrayList<>();
    }

    public static SmartHomeController getInstance() {
        if (instance == null) {
            instance = new SmartHomeController();
        }
        return instance;
    }

    public void addDevice(SmartDevice device) {
        devices.add(device);
        System.out.println("Added device: " + device.getClass().getSimpleName());
    }

    public void turnAllOn() {
        for (SmartDevice device : devices) {
            device.turnOn();
        }
    }

    public void turnAllOff() {
        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }

    public void showAllStatuses() {
        System.out.println("---- Device Statuses ----");
        for (SmartDevice device : devices) {
            System.out.println(device.getStatus());
        }
    }

    public List<SmartDevice> getDevices() {
        return devices;
    }
}
