package assistant.proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;
import state.State;

public interface GumballMachineRemote extends Remote {

  int getBallsLeft() throws RemoteException;
  String getLocation() throws RemoteException;
  State getState() throws RemoteException;
}
