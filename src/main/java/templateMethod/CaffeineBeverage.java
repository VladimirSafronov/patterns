package templateMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class CaffeineBeverage {

  final void prepareRecipe() {
    boilWater();
    brew();
    pourCup();
    if (isCondimentsAdd()) {
      addCondiments();
    }
  }

  private void boilWater() {
    System.out.println("Boiling water...");
  }

  private void pourCup() {
    System.out.println("Pouring into cup");
  }

  abstract void brew();

  abstract void addCondiments();

  /**
   * Метод-перехватчик (пример)
   */
  protected boolean isCondimentsAdd() {
    return false;
  }

  protected String getUserInput(String msg) {
    String ans = null;

    System.out.println(msg);

    try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
      ans = in.readLine();
    } catch (IOException ex) {
      System.err.println("IO error trying to read your answer");
    }
    if (ans == null) {
      return "n";
    }
    return ans;
  }
}
