package strategy;

import strategy.dto.Knight;
import strategy.skills.AxeBehavior;
import strategy.skills.BowAndArrowBehavior;
import strategy.skills.KnifeBehavior;
import strategy.skills.SwordBehavior;

public class Main {

  static KnifeBehavior knifeBehavior;
  static AxeBehavior axeBehavior;
  static SwordBehavior swordBehavior;
  static BowAndArrowBehavior bowAndArrowBehavior;

  static {
    knifeBehavior = new KnifeBehavior();
    axeBehavior = new AxeBehavior();
    swordBehavior = new SwordBehavior();
    bowAndArrowBehavior = new BowAndArrowBehavior();
  }

  public static void main(String[] args) {

    Character character = new Knight();
    character.setWeapon(knifeBehavior);
    character.weapon.useWeapon();
    System.out.println("Character learning new weapon...");
    character.setWeapon(swordBehavior);
    character.weapon.useWeapon();

  }
}
