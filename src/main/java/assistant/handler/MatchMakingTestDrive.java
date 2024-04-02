package assistant.handler;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class MatchMakingTestDrive {

  Map<String, Person> database;

  public static void main(String[] args) {
    MatchMakingTestDrive test = new MatchMakingTestDrive();
    test.drive();
  }

  public MatchMakingTestDrive() {
    initializeDatabase();
  }

  public void drive() {
    Person joe = getPersonFromDatabase("Joe Javabean");
    Person ownerProxy = getOwnerProxy(joe);
    System.out.println("Name is " + ownerProxy.getName());
    ownerProxy.setInterests("bowling, Go");
    System.out.println(ownerProxy.getInterests());
    try {
      ownerProxy.setGeekRating(10);
    } catch (Exception e) {
      System.out.println("Can't set rating from owner proxy");
    }
    System.out.println("Rating is " + ownerProxy.getGeekRating());

    System.out.println("=============");

    Person nonOwnerProxy = getNonOwnerProxy(joe);
    System.out.println("Name is " + nonOwnerProxy.getName());
    try {
      nonOwnerProxy.setInterests("bowling, Go");
    } catch (Exception e) {
      System.out.println("Can't set interests from non owner proxy");
    }
    nonOwnerProxy.setGeekRating(3);
    System.out.println("Rating set from non owner proxy");
    System.out.println("Rating is " + nonOwnerProxy.getGeekRating());
  }

  /**
   * Создание заместителя для владельца страницы
   */
  Person getOwnerProxy(Person person) {
    return (Person) Proxy.newProxyInstance(
        person.getClass().getClassLoader(),
        person.getClass().getInterfaces(),
        new OwnerInvocationHandler(person));
  }

  Person getNonOwnerProxy(Person person) {
    return (Person) Proxy.newProxyInstance(
        person.getClass().getClassLoader(),
        person.getClass().getInterfaces(),
        new NonOwnerInvocationHandler(person)
    );
  }

  private Person getPersonFromDatabase(String personName) {
    return database.get(personName);
  }

  private void initializeDatabase() {
    database = new HashMap<>();

    Person person = new PersonImpl();
    person.setName("Joe Javabean");
    person.setGender("M");

    database.put("Joe Javabean", person);
  }
}
