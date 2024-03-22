package observer.displays;

import observer.Observer;
import observer.WeatherData;

/**
 * Конкретная реализация подписчика текущих показателей
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

  private float temperature;
  private float humidity;
  private final WeatherData weatherData;

  public CurrentConditionDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void update() {
    this.temperature = weatherData.getTemperature();
    this.humidity = weatherData.getHumidity();

    display();
  }

  @Override
  public void display() {
    System.out.println(
        "Current conditions: " + temperature + "С degrees and " + humidity + "% humidity");
  }
}
