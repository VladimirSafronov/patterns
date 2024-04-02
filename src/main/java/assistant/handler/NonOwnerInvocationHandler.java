package assistant.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Класс-обработчик (посетителя страницы сайта знакомств)
 */
public class NonOwnerInvocationHandler implements InvocationHandler {

  Person person;

  public NonOwnerInvocationHandler(Person person) {
    this.person = person;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
    try {
      if (method.getName().startsWith("get") || method.getName().equals("setGeekRating")) {
        return method.invoke(person, args);
      } else if (method.getName().startsWith("set")) {
        throw new IllegalAccessException();
      }
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    }
    return null;
  }
}
