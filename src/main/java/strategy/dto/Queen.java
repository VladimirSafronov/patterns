package strategy.dto;

import strategy.Character;

public class Queen extends Character {

  @Override
  protected void fight() {
    System.out.println("Queen is fighting");
  }
}
