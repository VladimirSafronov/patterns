package assistant.rmibase;

import java.rmi.Naming;

/**
 * Реализация клиента
 */
public class MyRemoteClient {

  public static void main(String[] args) {
    new MyRemoteClient().go();
  }

  /**
   * "rmi://127.0.0.1/RemoteHello" - обращение к localhost и имени сервиса, которое задано в
   * MyRemoteImpl
   */
  void go() {
    try {
      MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
      String messageFromServer = service.sayHello();
      System.out.println(messageFromServer);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
