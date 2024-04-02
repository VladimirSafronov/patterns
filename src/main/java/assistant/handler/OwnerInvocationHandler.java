package assistant.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Класс-обработчик (владельца страницы сайта знакомств)
 */
public class OwnerInvocationHandler implements InvocationHandler {

  Person person;

  public OwnerInvocationHandler(Person person) {
    this.person = person;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
    try {
      //если вызван get метод, вызов делегируется реальному объекту
      if (method.getName().startsWith("get")) {
        return method.invoke(person, args);
        //пользователь не может выставлять рейтинг сам себе
      } else if (method.getName().equals("setGeekRating")) {
        throw new IllegalAccessException();
      } else if (method.getName().startsWith("set")) {
        return method.invoke(person, args);
      }
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    }
    return null;
  }
}
