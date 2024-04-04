package mult;

/**
 * Интерфейс, который реализуют наблюдаемые объекты
 */
public interface QuackObservable {

  void registerObserver(Observer observer);

  void notifyObservers();
}
