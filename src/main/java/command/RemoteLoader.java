package command;

/**
 * Класс клиента. Он не знает как реализована команда, которую он вызывает
 */
public class RemoteLoader {

  public static void main(String[] args) {
    Invoker invoker = new Invoker();
    Light light = new Light();
    LightOnCommand lightOnCommand = new LightOnCommand(light);
    LightOffCommand lightOffCommand = new LightOffCommand(light);

    invoker.setCommand(0, lightOnCommand, lightOffCommand);
    invoker.onButtonWasPushed(0);
    invoker.offButtonWasPushed(0);
  }
}
