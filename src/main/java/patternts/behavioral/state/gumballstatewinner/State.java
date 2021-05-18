package patternts.behavioral.state.gumballstatewinner;

public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
