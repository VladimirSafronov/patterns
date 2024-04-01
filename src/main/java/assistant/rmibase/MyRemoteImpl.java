package assistant.rmibase;

import java.rmi.*;
import java.rmi.server.*;

/**
 * Реализация интерфейса удаленного доступа
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

  private static final long serialVersionUID = 1L;

  @Override
  public String sayHello() {
    return "Hello from server";
  }

  public MyRemoteImpl() throws RemoteException {
  }

  public static void main(String[] args) {

    try {
      MyRemote service = new MyRemoteImpl();
      Naming.rebind("rmi://127.0.0.1:1099/RemoteHello", service);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
