package patternts.behavioral.command.simpleRemote1;

public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
