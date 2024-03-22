package decorator;

/**
 * Базовый класс всех классов-декораторов
 */
public abstract class CondimentDecorator extends Beverage {

  /**
   * Объект заворачивается в каждый декоратор
   */
  Beverage beverage;

  public abstract String getDescription();
}
