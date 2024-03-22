package decorator;

/**
 * Абстрактный класс от которого будут наследоваться базовые реализации, и абстрактный базовый класс
 * оберток
 */
public abstract class Beverage {

  String description = "Unknown Beverage";

  public String getDescription() {
    return description;
  }

  public abstract double cost();
}
