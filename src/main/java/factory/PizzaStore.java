package factory;

/**
 * Класс делегирует создание конкретного типа пиццы через фабричный метод классу, реализующему себя
 */
public abstract class PizzaStore {

  public Pizza orderPizza(String type) {
    Pizza pizza = createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
  }

  /**
   * Фабричный метод
   */
  abstract Pizza createPizza(String type);
}
