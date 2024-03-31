package state;

import java.util.Random;

/**
 * Реализация состояния с оплаченным мячом
 */
public class HasQuarterState implements State {

  GumballMachine gumballMachine;
  Random winRandom = new Random(System.currentTimeMillis());

  public HasQuarterState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("No more money, please");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("Returning quarter ...");
    gumballMachine.setState(gumballMachine.getNoQuarterState());
  }

  @Override
  public boolean turnCrank() {
    System.out.println("You turned...");
    int winner = winRandom.nextInt(10);
    if ((winner == 0) && gumballMachine.getBallsLeft() > 1) {
      gumballMachine.setState(gumballMachine.getWinnerState());
    } else {
      gumballMachine.setState(gumballMachine.getSoldState());
    }
    return true;
  }

  @Override
  public void dispense() {
    System.out.println("No gumball dispensed");
  }
}
