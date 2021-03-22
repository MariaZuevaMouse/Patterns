package patternts.creational.builder.simpleexample;

public class TestBuilderPattern {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder("1000 GB", "16 Gb")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();

        System.out.println(computer);
    }
}
