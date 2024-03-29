package iterator;

import java.util.Iterator;

/**
 * Общий интерфейс итератора отделяет клиента от конкретных реализаций коллекции объектов
 */
public interface Menu {

  Iterator<MenuItem> createIterator();
  String getMenuName();
}
