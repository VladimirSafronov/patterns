package mult.fabric;

import mult.GooseAdapter;
import mult.Quackable;
import mult.pojo.Goose;

public class GooseFactory extends AbstractGooseFactory {

  @Override
  public Quackable createGoose() {
    return new GooseAdapter(new Goose());
  }
}
