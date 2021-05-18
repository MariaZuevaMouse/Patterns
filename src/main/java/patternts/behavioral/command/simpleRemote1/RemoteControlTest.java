package patternts.behavioral.command.simpleRemote1;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        Garage garageDore = new Garage();
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageOpenCommand garageOpen = new GarageOpenCommand(garageDore);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();


    }
}
