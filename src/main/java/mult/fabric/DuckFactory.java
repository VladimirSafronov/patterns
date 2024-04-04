package mult.fabric;

import mult.Quackable;
import mult.pojo.DuckCall;
import mult.pojo.MallardDuck;
import mult.pojo.RedheadDuck;
import mult.pojo.RubberDuck;

/**
 * Фабрика возвращающая объекты обычных уток
 */
public class DuckFactory extends AbstractDuckFactory {

  @Override
  public Quackable createMallardDuck() {
    return new MallardDuck();
  }

  @Override
  public Quackable createDuckCall() {
    return new DuckCall();
  }

  @Override
  public Quackable createRedHeadDuck() {
    return new RedheadDuck();
  }

  @Override
  public Quackable createRubberDuck() {
    return new RubberDuck();
  }
}
