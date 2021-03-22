package patternts.creational.builder.withdirector;

import patternts.creational.builder.withdirector.builders.CarBuilder;
import patternts.creational.builder.withdirector.builders.CarManualBuilder;
import patternts.creational.builder.withdirector.cars.Car;
import patternts.creational.builder.withdirector.cars.Manual;
import patternts.creational.builder.withdirector.director.Director;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built: \n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder ();

        director.constructSportCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\n Car manual built: \n " + carManual.print());

    }
}
