package strategy.skills;

import strategy.WeaponBehavior;

/**
 * Реализация удара ножом
 */
public class KnifeBehavior implements WeaponBehavior {

  @Override
  public void useWeapon() {
    System.out.println("Fighting with knife");
  }
}
