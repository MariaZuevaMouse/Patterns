package patternts.structural.facade.hometheatre;

public class Tuner {
    String description;
    Amplifier amplifier;
    double frequency;

    public Tuner(String description, Amplifier amplifier) {
        this.description = description;
    }

    public void on(){
        System.out.println(description + " on");
    }
    public void off(){
        System.out.println(description + " off");
    }

    public void setFrequency(double frequency) {
        System.out.println(description + " setting frequency to " + frequency);
        this.frequency = frequency;
    }

    public void setAm(){
        System.out.println(description + " settig AM mode");
    }

    public  void setFm(){
        System.out.println(description + " setting FM mode");
    }

    @Override
    public String toString() {
        return "Tuner{" +
                "description='" + description + '\'' +
                '}';
    }
}