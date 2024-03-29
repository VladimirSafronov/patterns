package composite;

/**
 * Клиент
 */
public class Waitress {

  /**
   * Компонент верхнего уровня, который содержит все меню
   */
  MenuComponent allMenus;

  public Waitress(MenuComponent allMenus) {
    this.allMenus = allMenus;
  }

  public void printMenu() {
    allMenus.print();
  }
}
