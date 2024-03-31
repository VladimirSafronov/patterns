package state;

/**
 * Реализация состояния выдачи мячика
 */
public class SoldState implements State {

  GumballMachine gumballMachine;

  public SoldState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("Wait for a gumball firstly");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("You are already bought a gumball");
  }

  @Override
  public boolean turnCrank() {
    System.out.println("Wait a bit. And take your gumball");
    return false;
  }

  @Override
  public void dispense() {
    gumballMachine.releaseBall();
    gumballMachine.setState(gumballMachine.getBallsLeft() < 1 ?
        gumballMachine.getSoldOutState() : gumballMachine.getNoQuarterState());
  }
}
