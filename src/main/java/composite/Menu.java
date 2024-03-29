package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Реализация компонента древовидной структуры.
 */
public class Menu extends MenuComponent {

  /**
   * Список компонентов и листьев содержащихся в данном компоненте
   */
  List<MenuComponent> menuComponents;
  String name;
  String description;

  public Menu(String name, String description) {
    this.menuComponents = new ArrayList<>();
    this.name = name;
    this.description = description;
  }

  @Override
  public void add(MenuComponent menuComponent) {
    menuComponents.add(menuComponent);
  }

  @Override
  public void remove(MenuComponent menuComponent) {
    menuComponents.remove(menuComponent);
  }

  @Override
  public MenuComponent getChild(int i) {
    return menuComponents.get(i);
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public void print() {
    System.out.print("\n" + getName());
    System.out.println(", " + getDescription());
    System.out.println("---------------------");

    for (MenuComponent component : menuComponents) {
      component.print();
    }
  }
}
