package singleton;

/**
 * Представлены различные варианты создания Одиночки. Нужно выбрать свою реализацию
 */
public class Singleton {

  /**
   * Переменная единственного экземпляра класса. Если в приложении гарантированно используется
   * объект, инициализируется сразу
   */
  private static Singleton INSTANCE;

  private Singleton() {
  }

  /**
   * Простой способ создания не учитывающий многопоточность
   */
  public static Singleton getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new Singleton();
    }
    return INSTANCE;
  }

  /**
   * Надежный способ создания Одиночки в многопоточном приложении. Способ медленный, не допустим в
   * высоконагруженной среде
   */
  public static synchronized Singleton getInstance2() {
    if (INSTANCE == null) {
      INSTANCE = new Singleton();
    }
    return INSTANCE;
  }

  /**
   * Способ создания Одиночки в многопоточном высоконагруженном приложении (требует добавление
   * переменной INSTANCE volatile)
   */
  public static Singleton getInstance3() {
    if (INSTANCE == null) {
      synchronized (Singleton.class) {
        if (INSTANCE == null) {
          INSTANCE = new Singleton();
        }
      }
    }
    return INSTANCE;
  }
}
