package iterator;

public class MenuTest {

  public static void main(String[] args) {
    Menu pancakeHouseMenu = new PancakeHouseMenu();
    Menu dinerMenu = new DinerMenu();
    Waitress waitress = new Waitress(dinerMenu, pancakeHouseMenu);
    waitress.printMenu();
  }
}
