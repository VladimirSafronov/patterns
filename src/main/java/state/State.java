package state;

import java.io.Serializable;

/**
 * Интерфейс состояний автомата с мячиками
 */
public interface State extends Serializable {

  void insertQuarter();

  void ejectQuarter();

  boolean turnCrank();

  void dispense();
}
