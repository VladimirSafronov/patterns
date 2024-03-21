package strategy.skills;

import strategy.WeaponBehavior;

/**
 * Реализация выстрела из лука
 */
public class BowAndArrowBehavior implements WeaponBehavior {

  @Override
  public void useWeapon() {
    System.out.println("Shooting with bow");
  }
}
