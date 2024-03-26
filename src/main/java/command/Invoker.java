package command;

/**
 * Класс инициатор. Получает задание от клиента, и делегирует его исполнителю (ничего не
 * зная о реализации)
 */
public class Invoker {

  public static final int TOTAL_BUTTON_COUNT = 5;
  Command[] onCommands;
  Command[] offCommands;

  /**
   * В конструкторе инициализируются кнопки устройства, и заполняются пустыми объектами
   */
  public Invoker() {
    onCommands = new Command[TOTAL_BUTTON_COUNT];
    offCommands = new Command[TOTAL_BUTTON_COUNT];

    Command noCommand = new NoCommand();
    for (int i = 0; i < TOTAL_BUTTON_COUNT; i++) {
      onCommands[i] = noCommand;
      offCommands[i] = noCommand;
    }
  }

  void setCommand(int slot, Command onCommand, Command offCommand) {
    onCommands[slot] = onCommand;
    offCommands[slot] = offCommand;
  }

  void onButtonWasPushed(int slot) {
    onCommands[slot].execute();
  }

  void offButtonWasPushed(int slot) {
    offCommands[slot].execute();
  }
}
