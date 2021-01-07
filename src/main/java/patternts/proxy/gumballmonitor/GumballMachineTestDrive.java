package patternts.proxy.gumballmonitor;
/*
* to start class go to main directory
*
* compile and start with 2 arguments Location and count
*
* */

public class GumballMachineTestDrive {
    public static void main(String[] args) {
//        int count =0;
//
//        if(args.length<2){
//            System.out.println("Start Gumball machine type: GumballMachine <name> <inventory>");
//            System.exit(1);
//        }
//
//        try {
//            count = Integer.parseInt(args[1]);
//        }catch (Exception e){
//            e.printStackTrace();
//            System.exit(1);
//        }
//
//        GumballMachine gumballMachine = new GumballMachine(args[0], count);

        GumballMachine gumballMachine = new GumballMachine("Shop", 20);

        GumballMonitor monitor = new GumballMonitor(gumballMachine);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        monitor.report();

    }
}
