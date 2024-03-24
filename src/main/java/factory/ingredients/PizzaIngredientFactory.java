package factory.ingredients;

/**
 * Базовый интерфейс абстрактной фабрики, который реализуют фабрики создающие конкретные объекты
 */
public interface PizzaIngredientFactory {

  Dough createDough();

  Sauce createSauce();

  Cheese createCheese();

  Pepperoni createPepperoni();

  Clams createClam();
}
