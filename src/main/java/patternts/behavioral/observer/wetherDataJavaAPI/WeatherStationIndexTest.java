package patternts.behavioral.observer.wetherDataJavaAPI;

import patternts.behavioral.observer.wetherDataJavaAPI.observable.WeatherData;
import patternts.behavioral.observer.wetherDataJavaAPI.observers.CurrentConditionDisplay;
import patternts.behavioral.observer.wetherDataJavaAPI.observers.ForecastDisplay;
import patternts.behavioral.observer.wetherDataJavaAPI.observers.HeatIndexDisplay;
import patternts.behavioral.observer.wetherDataJavaAPI.observers.StatisticsDisplay;

public class WeatherStationIndexTest {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditions = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

    }
}
