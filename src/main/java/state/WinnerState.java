package state;

/**
 * Реализация состояния выдачи мячиков (в результате выигрыша - вероятность 10%)
 */
public class WinnerState implements State {

  private static final long serialVersionUID = 2L;
  transient GumballMachine gumballMachine;

  public WinnerState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("Wait for a gumballs firstly");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("You are already bought a gumball");
  }

  @Override
  public boolean turnCrank() {
    System.out.println("Wait a bit. And take your gumballs");
    return false;
  }

  @Override
  public void dispense() {
    gumballMachine.releaseBall();
    if (gumballMachine.getBallsLeft() == 0) {
      gumballMachine.setState(gumballMachine.getSoldState());
    } else {
      System.out.println("You are lucky!!!");
      gumballMachine.releaseBall();
      gumballMachine.setState(gumballMachine.getBallsLeft() < 1 ?
          gumballMachine.getSoldOutState() : gumballMachine.getNoQuarterState());
    }
  }
}
