package patternts.behavioral.observer.wetherDataJavaAPI;


import patternts.behavioral.observer.wetherDataJavaAPI.observable.WeatherData;
import patternts.behavioral.observer.wetherDataJavaAPI.observers.CurrentConditionDisplay;
import patternts.behavioral.observer.wetherDataJavaAPI.observers.ForecastDisplay;
import patternts.behavioral.observer.wetherDataJavaAPI.observers.StatisticsDisplay;

public class WeatherStationTest {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay =
                new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay =
                new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay =
                new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80,65, 30.4f);
        weatherData.setMeasurements(82,63, 29.4f);
        weatherData.setMeasurements(78,90, 29.4f);
    }
}
