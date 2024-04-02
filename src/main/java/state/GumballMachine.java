package state;

import assistant.proxy.GumballMachineRemote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Главный класс аппарата резиновых мячей
 */
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {

  private static final long serialVersionUID = 2L;
  State hasQuarterState;
  State noQuarterState;
  State soldOutState;
  State soldState;
  State winnerState;
  String location;

  State state;
  int ballsLeft;

  public GumballMachine(int ballsLeft) throws RemoteException {
    this.hasQuarterState = new HasQuarterState(this);
    this.noQuarterState = new NoQuarterState(this);
    this.soldOutState = new SoldOutState(this);
    this.soldState = new SoldState(this);
    this.winnerState = new WinnerState(this);

    this.state = ballsLeft > 0 ? noQuarterState : soldOutState;
    this.ballsLeft = ballsLeft;
  }

  public GumballMachine(String location, int ballsLeft) throws RemoteException {
    this.hasQuarterState = new HasQuarterState(this);
    this.noQuarterState = new NoQuarterState(this);
    this.soldOutState = new SoldOutState(this);
    this.soldState = new SoldState(this);
    this.winnerState = new WinnerState(this);
    this.location = location;

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

  @Override
  public int getBallsLeft() {
    return ballsLeft;
  }

  @Override
  public String getLocation() {
    return location;
  }

  @Override
  public State getState() {
    return state;
  }

  @Override
  public String toString() {
    return "State=" + state +
        ", ballsLeft=" + ballsLeft +
        '}';
  }
}
