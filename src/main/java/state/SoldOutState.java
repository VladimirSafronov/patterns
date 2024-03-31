package state;

/**
 * Реализация состояния автомата без товара
 */
public class SoldOutState implements State {

  GumballMachine gumballMachine;

  public SoldOutState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("No balls in gumball machine");
    ejectQuarter();
  }

  @Override
  public void ejectQuarter() {
    System.out.println("Money returning ...");
  }

  @Override
  public boolean turnCrank() {
    System.out.println("No balls in gumball machine");
    return false;
  }

  @Override
  public void dispense() {
    System.out.println("No balls in gumball machine");
  }
}
