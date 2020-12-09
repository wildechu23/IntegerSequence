import java.util.NoSuchElementException;

public class Range implements IntegerSequence {
  private int start, end, current;

  public Range(int start, int end) {
    this.start = start;
    this.end = end;
    this.current = start;
  }

  public void reset() {
    current = 0;
  }

  public int length() {
    return end - start + 1;
  }

  public boolean hasNext() {
    return current < length();
  }

  // @throws NoSuchElementException
  public int next() {
    if(current > length()) {
      throw new NoSuchElementException();
    } else {
      current++;
      return current - 2;
    }
  }

}