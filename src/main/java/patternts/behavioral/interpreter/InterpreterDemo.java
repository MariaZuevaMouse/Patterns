package patternts.behavioral.interpreter;

public class InterpreterDemo {

    public InterpreterContext ic;

    public InterpreterDemo(InterpreterContext ic) {
        this.ic = ic;
    }

    public String interpret(String str){
        Expression exp = null;
        if(str.contains("Hexadecimal")){
            exp = new IntToHexExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        }else if(str.contains("Binary")){
            exp = new IntToBinaryExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        }
        else return str;

        return exp.interpret(ic);
    }

    public static void main(String[] args) {
        String str1 = "28 in Binary";
        String str2 = "28 in Hexadecimal";

        InterpreterDemo intd = new InterpreterDemo(new InterpreterContext());



        System.out.println(str1 + " = " + intd.interpret(str1));
        System.out.println(str2 + " = " + intd.interpret(str2));
    }
}
