package state;

/**
 * Интерфейс состояний автомата с мячиками
 */
public interface State {

  void insertQuarter();

  void ejectQuarter();

  boolean turnCrank();

  void dispense();
}
