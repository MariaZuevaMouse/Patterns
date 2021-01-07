package patternts.combine.combining.decorator3;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    private void simulate() {
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redHeadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter( new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\n  Duck Simulator: with Goose Adapter / with decorator");

        simulate(mallardDuck);
        simulate(redHeadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println("\n The ducks quacked " +QuackCounter.getQuacks() +" times");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
