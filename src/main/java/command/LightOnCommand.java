package command;

/**
 * Объект команды, инициализирующий запуск непосредственного действия
 */
public class LightOnCommand implements Command {

  Light light;

  public LightOnCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.on();
  }
}
