package strategy.dto;

import strategy.Character;

public class King extends Character {

  @Override
  protected void fight() {
    System.out.println("King is fighting");
  }
}
