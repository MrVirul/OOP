package Lab09.Question04;

public class Device {
    String deviceID;
    String deviceType;
    static int deviceCount;


    public Device(String deviceID, String deviceType) {
        this.deviceID = deviceID;
        this.deviceType = deviceType;
        deviceCount++;

    }

    public void deviceInfo(){
        System.out.println(deviceID + "\n" + deviceType + "\n\n");
    }
    static {
        deviceCount = 0;
    }

    public static void displayDeviceCount(){
        System.out.println("Device count is : " + deviceCount);
    }
}
