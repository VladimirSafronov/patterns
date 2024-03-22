package decorator;

/**
 * Класс-обертка (декоратор)
 */
public class Whip extends CondimentDecorator {

  public Whip(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public double cost() {
    return beverage.cost() + .25;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Whip";
  }
}
