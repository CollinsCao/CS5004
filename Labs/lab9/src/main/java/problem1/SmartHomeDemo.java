package problem1;

public class SmartHomeDemo {

    public static void main(String[] args) {

        SmartDevice light = DeviceFactory.createDevice("light");
        SmartDevice speaker = DeviceFactory.createDevice("speaker");

        LegacyThermostat legacyThermostat = new LegacyThermostat();
        SmartDevice thermostatAdapter = new LegacyThermostatAdapter(legacyThermostat);

        SmartHomeController controller = SmartHomeController.getInstance();
        controller.addDevice(light);
        controller.addDevice(speaker);
        controller.addDevice(thermostatAdapter);

        controller.showAllStatuses();

        SmartHomeFacade facade = new SmartHomeFacade(controller);

        facade.arriveHome();
        controller.showAllStatuses();

        facade.activateNightMode();
        controller.showAllStatuses();

        facade.leaveHome();
        controller.showAllStatuses();
    }
}