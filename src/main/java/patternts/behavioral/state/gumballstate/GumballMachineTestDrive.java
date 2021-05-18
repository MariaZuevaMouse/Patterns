package patternts.behavioral.state.gumballstate;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);
        System.out.println(gumballMachine.getCount());

        gumballMachine.insertQuarter();
        gumballMachine.trunkCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.trunkCrank();
        gumballMachine.insertQuarter();
        gumballMachine.trunkCrank();

        System.out.println(gumballMachine);

        System.out.println(gumballMachine.getCount());
    }
}
