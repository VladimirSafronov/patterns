package mult.fabric;

import mult.QuackCounter;
import mult.Quackable;
import mult.pojo.DuckCall;
import mult.pojo.MallardDuck;
import mult.pojo.RedheadDuck;
import mult.pojo.RubberDuck;

/**
 * Создает объекты уток обернутые декоратором
 */
public class CountingDuckFactory extends AbstractDuckFactory {

  @Override
  public Quackable createMallardDuck() {
    return new QuackCounter(new MallardDuck());
  }

  @Override
  public Quackable createDuckCall() {
    return new QuackCounter(new DuckCall());
  }

  @Override
  public Quackable createRedHeadDuck() {
    return new QuackCounter(new RedheadDuck());
  }

  @Override
  public Quackable createRubberDuck() {
    return new QuackCounter(new RubberDuck());
  }
}
