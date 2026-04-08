package problem1;

public class SmartHomeFacade {
    private final SmartHomeController controller;

    public SmartHomeFacade(SmartHomeController controller) {
        this.controller = controller;
    }

    public void activateNightMode() {
        System.out.println("\nActivating Night Mode...");
        for (SmartDevice device : controller.getDevices()) {
            if (device instanceof SmartLight) {
                device.turnOff();
            } else if (device instanceof SmartSpeaker) {
                device.turnOff();
            } else {
                device.turnOn(); // thermostat stays on at night
            }
        }
    }

    public void leaveHome() {
        System.out.println("\nLeaving Home...");
        controller.turnAllOff();
    }

    public void arriveHome() {
        System.out.println("\nArriving Home...");
        controller.turnAllOn();
    }
}
