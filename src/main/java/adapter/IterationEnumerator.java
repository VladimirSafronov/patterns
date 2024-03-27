package adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class IterationEnumerator implements Enumeration<Object> {

  Iterator<Object> iterator;

  @Override
  public boolean hasMoreElements() {
    return iterator.hasNext();
  }

  @Override
  public Object nextElement() {
    return iterator.next();
  }
}
