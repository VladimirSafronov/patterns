package mult;

import mult.fabric.AbstractDuckFactory;
import mult.fabric.AbstractGooseFactory;
import mult.fabric.CountingDuckFactory;
import mult.fabric.GooseFactory;

public class DuckSimulator {

  public static void main(String[] args) {
    DuckSimulator simulator = new DuckSimulator();
    AbstractDuckFactory duckFactory = new CountingDuckFactory();
    AbstractGooseFactory gooseFactory = new GooseFactory();

    simulator.simulate(duckFactory, gooseFactory);
  }

  void simulate(AbstractDuckFactory duckFactory, AbstractGooseFactory gooseFactory) {
    Quackable mallardDuck = duckFactory.createMallardDuck();
    Quackable redheadDuck = duckFactory.createRedHeadDuck();
    Quackable duckCall = duckFactory.createDuckCall();
    Quackable gooseDuck = gooseFactory.createGoose();

    Flock flockOfDucks = new Flock();
    flockOfDucks.add(mallardDuck);
    flockOfDucks.add(redheadDuck);
    flockOfDucks.add(duckCall);
    flockOfDucks.add(gooseDuck);

    Quackable firstMallard = duckFactory.createMallardDuck();
    Quackable secondMallard = duckFactory.createMallardDuck();
    Quackable thirdMallard = duckFactory.createMallardDuck();
    Quackable fourthMallard = duckFactory.createMallardDuck();
    Flock flockOfMallards = new Flock();
    flockOfMallards.add(firstMallard);
    flockOfMallards.add(secondMallard);
    flockOfMallards.add(thirdMallard);
    flockOfMallards.add(fourthMallard);

    flockOfDucks.add(flockOfMallards);

    System.out.println("\nDuck Simulator: With Observer");
    Quackologist quackologist = new Quackologist();
    flockOfDucks.registerObserver(quackologist);

    simulate(flockOfDucks);

    System.out.println("The ducks quacked " + QuackCounter.getNumberOfQuacks() + " times");
  }

  void simulate(Quackable duck) {
    duck.quack();
  }
}
