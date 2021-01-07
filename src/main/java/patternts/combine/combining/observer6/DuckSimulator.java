package patternts.combine.combining.observer6;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();

        simulator.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {

        Quackable redHeadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        Flock flockDucks = new Flock();

        flockDucks.add(redHeadDuck);
        flockDucks.add(duckCall);
        flockDucks.add(rubberDuck);
        flockDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();

        Quackable oneMallardDuck = duckFactory.createMallardDuck();
        Quackable twoMallardDuck = duckFactory.createMallardDuck();
        Quackable threeMallardDuck = duckFactory.createMallardDuck();
        Quackable fourMallardDuck = duckFactory.createMallardDuck();

        flockOfMallards.add(oneMallardDuck);
        flockOfMallards.add(twoMallardDuck);
        flockOfMallards.add(threeMallardDuck);
        flockOfMallards.add(fourMallardDuck);

        flockDucks.add(flockOfMallards);

        Quackologist quackologist = new Quackologist();
        flockDucks.registerObserver(quackologist);
        flockOfMallards.registerObserver(quackologist);

        System.out.println("\n  Duck Simulator: with observer (whole Flock)with Goose Adapter / with decorator / with Abstract Factory/composite");
        simulate(flockDucks);

        System.out.println("\n  Duck Simulator:  with observer(mallard flock)with Goose Adapter / with decorator / with Abstract Factory/composite");
        simulate(flockOfMallards);

        System.out.println("\n The ducks quacked " + QuackCounter.getQuacks() +" times");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
