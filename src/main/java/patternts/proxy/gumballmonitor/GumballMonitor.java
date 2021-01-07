package patternts.proxy.gumballmonitor;

public class GumballMonitor {
    GumballMachine machine;

    public GumballMonitor(GumballMachine machine) {
        this.machine = machine;
    }

    public void report(){
        System.out.println("Gumball machine");
    }
}
