package iterator;

import java.util.Iterator;

/**
 * Arrays не имеет метода iterator(), поэтому создана собственная реализация перебора элементов
 * коллекции
 */
public class DinerMenuIterator implements Iterator<MenuItem> {

  MenuItem[] menuItems;
  int position;

  public DinerMenuIterator(MenuItem[] menuItems) {
    this.menuItems = menuItems;
    this.position = 0;
  }

  @Override
  public boolean hasNext() {
    return position < menuItems.length && menuItems[position] != null;
  }

  @Override
  public MenuItem next() {
    MenuItem item = menuItems[position];
    position++;
    return item;
  }
}
