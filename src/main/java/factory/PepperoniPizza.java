package factory;

import factory.ingredients.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {

  PizzaIngredientFactory ingredientFactory;
  public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }

  @Override
  void prepare() {
    System.out.println("Preparing " + name);
    ingredientFactory.createDough();
    ingredientFactory.createPepperoni();
  }
}
