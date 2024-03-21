package strategy.dto;

import strategy.Character;

public class Troll extends Character {

  @Override
  protected void fight() {
    System.out.println("Troll is fighting");
  }
}
