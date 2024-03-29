package iterator;

import java.util.Iterator;
import java.util.List;

/**
 * Объединение двух реализаций меню в одно
 */
public class Waitress {

  List<Menu> allMenus;

  public Waitress(List<Menu> allMenus) {
    this.allMenus = allMenus;
  }

  public void printMenu() {
    for (Menu menu : allMenus) {
      System.out.println("======" + menu.getMenuName() + "=======");
      printMenu(menu.createIterator());
    }
  }

  private void printMenu(Iterator<MenuItem> it) {
    while (it.hasNext()) {
      MenuItem menuItem = it.next();
      System.out.print(menuItem.getName() + ", ");
      System.out.print(menuItem.getPrice() + " -- ");
      System.out.println(menuItem.getDescription());
    }
  }
}
