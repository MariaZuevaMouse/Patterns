package patternts.state.gumballstate;

public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void turkCrank();
    public void dispense();
}
