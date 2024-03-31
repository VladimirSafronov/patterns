package state;

/**
 * Реализация состояния с неоплаченным мячом
 */
public class NoQuarterState implements State {

  GumballMachine gumballMachine;

  public NoQuarterState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("Inserted money");
    gumballMachine.setState(gumballMachine.hasQuarterState);
  }

  @Override
  public void ejectQuarter() {
    System.out.println("You didn't pay yet!");
  }

  @Override
  public boolean turnCrank() {
    System.out.println("Please, pay for gumball firstly!");
    return false;
  }

  @Override
  public void dispense() {
    System.out.println("No gumball dispensed");
  }
}
