package patternts.adapter.ducks;

public class TurkeyTest {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        Turkey duckAdapter = new DuckAdapter(duck);

        System.out.println("The Duck Adapter sauys ...");
        duckAdapter.gobble();
        duckAdapter.fly();
    }
}
