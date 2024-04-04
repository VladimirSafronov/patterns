package mult;

import mult.pojo.Goose;

/**
 * Адаптер для гуся с делегированием методу объекта
 */
public class GooseAdapter implements Quackable {

  Observable observable;

  Goose goose;

  public GooseAdapter(Goose goose) {
    this.goose = goose;
    observable = new Observable(this);
  }

  @Override
  public void quack() {
    goose.honk();
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
