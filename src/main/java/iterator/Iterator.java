package iterator;

/**
 * Собственный интерфейс для перебора элементов коллекций
 */
public interface Iterator {

  boolean hasNext();
  MenuItem next();
}
