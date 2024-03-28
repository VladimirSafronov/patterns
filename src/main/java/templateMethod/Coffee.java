package templateMethod;

public class Coffee extends CaffeineBeverage {

  private final String msgForCondimentsAdd = "Would you like milk and sugar with your coffee (y/n)?";

  @Override
  void brew() {
    System.out.println("Dripping Coffee through filter");
  }

  @Override
  void addCondiments() {
    System.out.println("Adding Sugar and Milk");
  }

  @Override
  protected boolean isCondimentsAdd() {
    String ans = getUserInput(msgForCondimentsAdd);
    return ans.equals("y");
  }


}
