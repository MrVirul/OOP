package Lab09.Question04;

public class DeviceApp {
    public static void main(String[] args) {
        Device device1 = new Device("A1","phone");
        Device device2 = new Device("A2","tab");
        Device device3 = new Device("A3","laptop");

        device1.deviceInfo();
        device2.deviceInfo();
        device3.deviceInfo();

        Device.displayDeviceCount();

    }
}
