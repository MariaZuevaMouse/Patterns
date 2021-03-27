package patternts.behavioral.chainOfResponsiblity.example1;

public class Dollar50Dispenser implements DispenseChain {
    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain){
        this.chain = nextChain;
    }

    @Override
    public void dispense(Currency cur){
        if(cur.getAmount()>=50){
            int num  = cur.getAmount()/50;
            int reminder = cur.getAmount()%50;
            System.out.println("Dispensing " + num + " 50$ note");
            if(reminder != 0) this.chain.dispense(new Currency(reminder));
        }else{
            this.chain.dispense(cur);
        }
    }

}
