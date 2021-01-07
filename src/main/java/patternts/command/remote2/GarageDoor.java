package patternts.command.remote2;

public class GarageDoor {
    String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    public void down() {
        System.out.println(location + " garage door is Down");
    }

    public void up(){
        System.out.println(location + " garage door is Up");
    }
}
