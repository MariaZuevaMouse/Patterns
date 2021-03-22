package patternts.creational.builder.withdirector.builders;

import patternts.creational.builder.withdirector.cars.CarType;
import patternts.creational.builder.withdirector.components.Engine;
import patternts.creational.builder.withdirector.components.GPSNavigator;
import patternts.creational.builder.withdirector.components.Transmission;
import patternts.creational.builder.withdirector.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
