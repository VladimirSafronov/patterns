package observer;

import observer.displays.CurrentConditionDisplay;
import observer.displays.StatisticDisplay;

public class Main {

  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();
    CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
    StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);

    weatherData.setMeasurements(80, 65, 30.4f);
    weatherData.measurementsChanged();
    weatherData.setMeasurements(82, 70, 25.2f);
    weatherData.measurementsChanged();
    weatherData.setMeasurements(78, 90, 35.4f);
    weatherData.measurementsChanged();

  }
}
