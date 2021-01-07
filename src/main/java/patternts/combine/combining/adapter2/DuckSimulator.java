package patternts.combine.combining.adapter2;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    private void simulate() {
        Quackable mallardDuck = new MallardDuck();
        Quackable redHeadDuck = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\n Duck Simulator: with Goose Adapter");

        simulate(mallardDuck);
        simulate(redHeadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
