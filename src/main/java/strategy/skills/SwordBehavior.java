package strategy.skills;

import strategy.WeaponBehavior;

/**
 * Реализация удара мечом
 */
public class SwordBehavior implements WeaponBehavior {

  @Override
  public void useWeapon() {
    System.out.println("Fighting with sword");
  }
}
