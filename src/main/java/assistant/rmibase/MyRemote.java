package assistant.rmibase;

import java.rmi.*;

/**
 * Интерфейс удаленного доступа
 */
public interface MyRemote extends Remote {

  String sayHello() throws RemoteException;
}
