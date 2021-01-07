package patternts.observer.wetherDataJavaAPI;

import patternts.observer.wetherDataJavaAPI.observable.WeatherData;
import patternts.observer.wetherDataJavaAPI.observers.CurrentConditionDisplay;
import patternts.observer.wetherDataJavaAPI.observers.ForecastDisplay;
import patternts.observer.wetherDataJavaAPI.observers.HeatIndexDisplay;
import patternts.observer.wetherDataJavaAPI.observers.StatisticsDisplay;

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
