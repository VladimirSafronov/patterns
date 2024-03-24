package factory;

import factory.ingredients.NYPizzaIngredientFactory;
import factory.ingredients.PizzaIngredientFactory;

/**
 * Класс конкретного создателя
 */
public class NYPizzaStore extends PizzaStore {

  @Override
  protected Pizza createPizza(String type) {
    Pizza pizza = null;
    PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

    switch (type) {
      case "cheese":
        pizza = new CheesePizza(ingredientFactory);
        pizza.setName("New York Style Cheese Pizza");
        break;
      case "clam":
        pizza = new ClamPizza(ingredientFactory);
        pizza.setName("New York Style Clam Pizza");
        break;
      case "veggie":
        pizza = new VeggiePizza(ingredientFactory);
        pizza.setName("New York Style Veggie Pizza");
        break;
      case "pepperoni":
        pizza = new PepperoniPizza(ingredientFactory);
        pizza.setName("New York Style Pepperoni Pizza");
        break;
    }

    return pizza;
  }
}
