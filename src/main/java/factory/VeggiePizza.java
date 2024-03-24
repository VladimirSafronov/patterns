package factory;

import factory.ingredients.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {

  PizzaIngredientFactory ingredientFactory;
  public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }

  @Override
  void prepare() {
    System.out.println("Preparing " + name);
    ingredientFactory.createDough();
    ingredientFactory.createSauce();
  }
}
