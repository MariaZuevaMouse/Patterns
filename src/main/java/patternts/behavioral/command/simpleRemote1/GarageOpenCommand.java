package patternts.behavioral.command.simpleRemote1;

public class GarageOpenCommand implements Command {
    Garage garage;

    public GarageOpenCommand(Garage garage) {
        this.garage = garage;
    }

    public void execute() {
        garage.open();
    }
}
