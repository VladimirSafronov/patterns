package factory;

import factory.ingredients.PizzaIngredientFactory;

/**
 * Класс конкретной реализации пиццы
 */
public class CheesePizza extends Pizza {

  PizzaIngredientFactory ingredientFactory;

  public CheesePizza(PizzaIngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }

  @Override
  void prepare() {
    System.out.println("Preparing " + name);
    ingredientFactory.createDough();
    ingredientFactory.createCheese();
    ingredientFactory.createSauce();
  }
}
