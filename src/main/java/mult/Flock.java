package mult;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс группирует объекты
 */
public class Flock implements Quackable {

  List<Quackable> ducks;

  public Flock() {
    ducks = new ArrayList<>();
  }

  public void add(Quackable duck) {
    ducks.add(duck);
  }

  @Override
  public void quack() {
    for (Quackable duck : ducks) {
      duck.quack();
    }
  }

  @Override
  public void registerObserver(Observer observer) {
    for (Quackable duck : ducks) {
      duck.registerObserver(observer);
    }
  }

  @Override
  public void notifyObservers() {
  }
}
