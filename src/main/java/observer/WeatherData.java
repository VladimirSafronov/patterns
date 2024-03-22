package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Данный класс получает информацию с метеодатчиков
 */
public class WeatherData implements Subject {

  private float temperature;
  private float humidity;
  private float pressure;
  private final List<Observer> observers;

  public WeatherData() {
    observers = new ArrayList<>();
  }

  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
  }

  @Override
  public void registerObserver(Observer o) {
    observers.add(o);
  }

  @Override
  public void removeObserver(Observer o) {
    observers.remove(o);
  }

  @Override
  public void notifyObservers() {
    for (Observer o : observers) {
      o.update();
    }
  }

  public float getTemperature() {
    return temperature;
  }

  public float getHumidity() {
    return humidity;
  }

  public float getPressure() {
    return pressure;
  }

  public void measurementsChanged() {
    notifyObservers();
  }
}
