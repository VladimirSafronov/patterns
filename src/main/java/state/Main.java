package state;

import java.rmi.Naming;

public class Main {

  public static void main(String[] args) {
    GumballMachine gumballMachine = null;
    int ballsCount;
    if (args.length < 2) {
      System.out.println("GumballMachine <name> <inventory>");
      System.exit(1);
    }
    try {
      ballsCount = Integer.parseInt(args[1]);
      gumballMachine = new GumballMachine(args[0], ballsCount);
      Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);
    } catch (Exception ex) {
      ex.printStackTrace();
    }

    System.out.println(gumballMachine);

    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();

    System.out.println(gumballMachine);

    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();

    System.out.println(gumballMachine);
  }
}
