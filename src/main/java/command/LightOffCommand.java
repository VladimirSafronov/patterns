package command;

/**
 * Объект команды, инициализирующий запуск непосредственного действия
 */
public class LightOffCommand implements Command {

  Light light;

  public LightOffCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.off();
  }
}
