import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
  @Test
  public void testReverseInPlace1() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] { 3 }, input1);
  }

  @Test
  public void testReverseInPlace2() {
    int[] input1 = { 3, 4, 5 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] { 5, 4, 3 }, input1);
  }

  @Test
  public void testReversed1() {
    int[] input1 = {};
    assertArrayEquals(new int[] {}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2() {
    int[] input1 = { 1, 2, 3, 4 };
    assertArrayEquals(new int[] { 4, 3, 2, 1 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAvg1() {
    double[] input1 = { 1 };
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0.001);
  }

  @Test
  public void testAvgPartner() {
    double[] input1 = { 1, 2, 3, 4 };
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input1), 0.001);
  }

  @Test
  public void testAvg3() {
    double[] input1 = { 1, 1, 1, 3, 3 };
    assertEquals(2.0, ArrayExamples.averageWithoutLowest(input1), 0.001);
  }
}
