package strategy;

public abstract class Character {

  WeaponBehavior weapon;

  public void setWeapon(WeaponBehavior weapon) {
    this.weapon = weapon;
  }

  protected abstract void fight();
}
