package assistant;

import java.rmi.RemoteException;

public class GumballMonitor {

  GumballMachineRemote machine;

  public GumballMonitor(GumballMachineRemote machine) {
    this.machine = machine;
  }

  public void report() {
    try {
      System.out.println("Gumball Machine: " + machine.getLocation());
      System.out.println("Current inventory: " + machine.getBallsLeft() + " gumballs");
      System.out.println("Current state: " + machine.getState());
    } catch (RemoteException e) {
      e.printStackTrace();
    }
  }
}
