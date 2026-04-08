package problem1;

public class DeviceFactory {

    public static SmartDevice createDevice(String type) {
        if (type == null) {
            throw new IllegalArgumentException("Device type cannot be null.");
        }

        switch (type.toLowerCase()) {
            case "light":
                return new SmartLight();
            case "speaker":
                return new SmartSpeaker();
            default:
                throw new IllegalArgumentException("Unknown device type: " + type);
        }
    }
}
