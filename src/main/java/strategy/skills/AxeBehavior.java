package strategy.skills;

import strategy.WeaponBehavior;

/**
 * Реализация удара топором
 */
public class AxeBehavior implements WeaponBehavior {

  @Override
  public void useWeapon() {
    System.out.println("Fighting with axe");
  }
}
