package patternts.strategy;

import patternts.strategy.durk.Durk;
import patternts.strategy.durk.MallardDuck;
import patternts.strategy.durk.ModelDuck;
import patternts.strategy.flyPossibility.FlyRocketPowered;

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
