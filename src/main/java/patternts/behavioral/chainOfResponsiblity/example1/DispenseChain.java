package patternts.behavioral.chainOfResponsiblity.example1;

public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);

    void dispense(Currency cur);
}
