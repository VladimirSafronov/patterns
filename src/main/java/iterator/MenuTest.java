package iterator;

import java.util.List;

public class MenuTest {

  public static void main(String[] args) {
    Waitress waitress = new Waitress(
        List.of(new PancakeHouseMenu(), new DinerMenu(), new CafeMenu()));
    waitress.printMenu();
  }
}
