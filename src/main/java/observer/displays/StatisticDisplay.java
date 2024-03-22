package observer.displays;

import observer.Observer;
import observer.WeatherData;

/**
 * Конкретная реализация подписчика статистики (для простоты примера средние показатели hardcoded)
 */
public class StatisticDisplay implements Observer, DisplayElement {

  private float temperature;
  private float avgTemp = 60f;
  private float humidity;
  private float avgHumidity = 50f;
  private float pressure;
  private float avgPressure = 27.2f;
  private final WeatherData weatherData;

  public StatisticDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  @Override
  public void update() {
    this.temperature = weatherData.getTemperature();
    this.humidity = weatherData.getHumidity();
    this.pressure = weatherData.getPressure();

    display();
  }

  @Override
  public void display() {
    System.out.println(
        "Avg conditions: " + getNewStatistic("temp", temperature) + "С degrees and "
            + getNewStatistic("humidity", humidity) + "% humidity and " +
            getNewStatistic("pressure", pressure) + " pressure");
  }

  private float getNewStatistic(String pointer, float value) {
    float newStat = 0;
    switch (pointer) {
      case "temp":
        newStat = (value + avgTemp) / 2;
        break;
      case "humidity":
        newStat = (value + avgHumidity) / 2;
        break;
      case "pressure":
        newStat = (value + avgPressure) / 2;
        break;
    }
    return newStat;
  }
}
