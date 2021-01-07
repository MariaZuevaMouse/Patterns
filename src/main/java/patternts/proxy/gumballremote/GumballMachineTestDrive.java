package patternts.proxy.gumballremote;

import java.rmi.Naming;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachineRemote gumballMachineRemote = null;
        int count;
//        if(args.length<2){
//            System.out.println("GumballMachine <name> <inventory>");
//            System.exit(1);
//        }

        try{
//            count = Integer.parseInt(args[1]);

//            gumballMachineRemote = new GumballMachine(args[0], count);
//            Naming.rebind("//" +args[0] +"/gumballmachine", gumballMachineRemote);
            gumballMachineRemote = new GumballMachine("seattle.mightygumball.com", 100);
            Naming.rebind("//" + "seattle.mightygumball.com" + "/gumballmachine", gumballMachineRemote);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
