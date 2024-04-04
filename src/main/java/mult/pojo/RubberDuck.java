package mult.pojo;

import mult.Observable;
import mult.Observer;
import mult.Quackable;

public class RubberDuck implements Quackable {

  Observable observable;

  public RubberDuck() {
    this.observable = new Observable(this);
  }

  @Override
  public void quack() {
    System.out.println("Squeak");
  }

  @Override
  public void registerObserver(Observer observer) {
    observable.registerObserver(observer);
  }

  @Override
  public void notifyObservers() {
    observable.notifyObservers();
  }
}
