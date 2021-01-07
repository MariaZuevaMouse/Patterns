package patternts.observer.wetherDataJavaAPI;


import patternts.observer.wetherDataJavaAPI.observable.WeatherData;
import patternts.observer.wetherDataJavaAPI.observers.CurrentConditionDisplay;
import patternts.observer.wetherDataJavaAPI.observers.ForecastDisplay;
import patternts.observer.wetherDataJavaAPI.observers.StatisticsDisplay;

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
