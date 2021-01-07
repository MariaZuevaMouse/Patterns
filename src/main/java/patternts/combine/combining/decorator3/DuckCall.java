package patternts.combine.combining.decorator3;

public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
