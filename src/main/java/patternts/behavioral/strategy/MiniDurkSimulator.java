package patternts.behavioral.strategy;

import patternts.behavioral.strategy.durk.Durk;
import patternts.behavioral.strategy.durk.MallardDuck;
import patternts.behavioral.strategy.durk.ModelDuck;
import patternts.behavioral.strategy.flyPossibility.FlyRocketPowered;

public class MiniDurkSimulator {
    public static void main(String[] args) {
        Durk mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Durk model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }
}
