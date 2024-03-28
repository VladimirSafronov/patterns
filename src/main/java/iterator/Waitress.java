package iterator;

import java.util.Iterator;

/**
 * Объединение двух реализаций меню в одно
 */
public class Waitress {

  Menu dinerMenu;
  Menu pancakeHouseMenu;

  public Waitress(Menu dinerMenu, Menu pancakeHouseMenu) {
    this.dinerMenu = dinerMenu;
    this.pancakeHouseMenu = pancakeHouseMenu;
  }

  public void printMenu() {
    Iterator<MenuItem> dinerMenuIterator = dinerMenu.createIterator();
    Iterator<MenuItem> breakfastMenuIterator = pancakeHouseMenu.createIterator();
    System.out.println("MENU\n----\nBREAKFAST");
    printMenu(breakfastMenuIterator);
    System.out.println("MENU\n----\nDINER");
    printMenu(dinerMenuIterator);
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
