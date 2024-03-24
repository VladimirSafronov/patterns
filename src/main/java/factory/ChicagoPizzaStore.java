package factory;

import factory.ingredients.ChicagoPizzaIngredientFactory;

/**
 * Класс конкретного создателя
 */
public class ChicagoPizzaStore extends PizzaStore {

  @Override
  Pizza createPizza(String type) {
    Pizza pizza = null;
    ChicagoPizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

    if (type.equals("cheese")) {
      pizza = new CheesePizza(ingredientFactory);
    } else if (type.equals("clam")) {
      pizza = new ClamPizza(ingredientFactory);
    }
    return pizza;
  }
}
