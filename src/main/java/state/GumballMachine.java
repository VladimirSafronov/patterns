package state;

/**
 * Главный класс аппарата резиновых мячей
 */
public class GumballMachine {

  State hasQuarterState;
  State noQuarterState;
  State soldOutState;
  State soldState;
  State winnerState;

  State state;
  int ballsLeft;

  public GumballMachine(int ballsLeft) {
    this.hasQuarterState = new HasQuarterState(this);
    this.noQuarterState = new NoQuarterState(this);
    this.soldOutState = new SoldOutState(this);
    this.soldState = new SoldState(this);
    this.winnerState = new WinnerState(this);

    this.state = ballsLeft > 0 ? noQuarterState : soldOutState;
    this.ballsLeft = ballsLeft;
  }

  public void insertQuarter() {
    state.insertQuarter();
  }

  public void ejectQuarter() {
    state.ejectQuarter();
  }

  /**
   * Метод dispense() не может быть вызыван пользователем напрямую, но вызывается из данного метода
   */
  public void turnCrank() {
    if (state.turnCrank()) {
      state.dispense();
    }
  }

  public void releaseBall() {
    if (ballsLeft < 1) {
      state = soldOutState;
      throw new NoBallsException("Gumball machine tries to release ball, but there are no balls");
    }
    state = noQuarterState;
    ballsLeft--;
    System.out.println("A gumball comes rolling out the slot...");
  }

  public void setState(State state) {
    this.state = state;
  }

  public State getHasQuarterState() {
    return hasQuarterState;
  }

  public State getNoQuarterState() {
    return noQuarterState;
  }

  public State getSoldOutState() {
    return soldOutState;
  }

  public State getSoldState() {
    return soldState;
  }

  public State getWinnerState() {
    return winnerState;
  }

  public int getBallsLeft() {
    return ballsLeft;
  }

  @Override
  public String toString() {
    return "State=" + state +
        ", ballsLeft=" + ballsLeft +
        '}';
  }
}
