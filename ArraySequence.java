import java.util.NoSuchElementException;

public class ArraySequence implements IntegerSequence {
  private int currentIndex;
  private int[] data;

  /*
   * Construct the sequence by copying values from the other array into the data
   * array
   */
  public ArraySequence(int[] other) {
    this.data = other;
    this.currentIndex = 0;
  }

  public ArraySequence(IntegerSequence otherseq) {
    for(int i = 0; i < otherseq.length() && otherseq.hasNext(); i++) {
      data[i] = otherseq.next();
    }
    otherseq.reset();
  }

  public boolean hasNext() {
    return currentIndex < data.length;
  }

  public int next() {
    if(currentIndex >= data.length) {
      throw new NoSuchElementException();
    } else {
      return data[currentIndex++];
    }
  }

  public int length() {
    return data.length;
  }

  public void reset() {
    currentIndex = 0;
  }
}