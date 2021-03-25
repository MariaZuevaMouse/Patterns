package patternts.structural.bridge.exampledevice.remote;

import patternts.structural.bridge.exampledevice.devices.Device;

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute(){
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
