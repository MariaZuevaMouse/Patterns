package patternts.creational.builder.withdirector.director;

import patternts.creational.builder.withdirector.builders.Builder;
import patternts.creational.builder.withdirector.cars.CarType;
import patternts.creational.builder.withdirector.components.Engine;
import patternts.creational.builder.withdirector.components.GPSNavigator;
import patternts.creational.builder.withdirector.components.Transmission;
import patternts.creational.builder.withdirector.components.TripComputer;

public class Director {
    public void constructSportCar(Builder builder){
        builder.setCarType(CarType.SPORT_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }

}
