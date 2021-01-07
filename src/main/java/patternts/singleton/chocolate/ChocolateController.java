package patternts.singleton.chocolate;

public class ChocolateController {
    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.getBoiler();
        boiler.fill();
        boiler.boil();
        boiler.drain();

        ChocolateBoiler boiler2 = ChocolateBoiler.getBoiler();

        System.out.println(boiler == boiler2);
        System.out.println(boiler.equals(boiler2));
        System.out.println(boiler.toString());
        System.out.println(boiler2.toString());

    }
}
