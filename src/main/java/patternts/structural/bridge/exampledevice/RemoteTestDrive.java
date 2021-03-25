package patternts.structural.bridge.exampledevice;

import patternts.structural.bridge.exampledevice.devices.Device;
import patternts.structural.bridge.exampledevice.devices.Radio;
import patternts.structural.bridge.exampledevice.devices.Tv;
import patternts.structural.bridge.exampledevice.remote.AdvancedRemote;
import patternts.structural.bridge.exampledevice.remote.BasicRemote;

public class RemoteTestDrive {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    private static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tess with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
