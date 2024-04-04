package mult;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс отвечает за регистрацию и оповещение крякающих
 */
public class Observable implements QuackObservable {

  List<Observer> observers;
  QuackObservable duck;

  public Observable(QuackObservable duck) {
    observers = new ArrayList<>();
    this.duck = duck;
  }

  @Override
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(duck);
    }
  }
}
