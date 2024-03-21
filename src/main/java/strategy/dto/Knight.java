package strategy.dto;

import strategy.Character;

public class Knight extends Character {

  @Override
  protected void fight() {
    System.out.println("Knight is fighting");
  }
}
