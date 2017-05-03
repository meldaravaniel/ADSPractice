package test.arrays;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static main.arrays.LeftShiftArray.getIndex;
import static main.arrays.LeftShiftArray.leftShift;
import static org.junit.Assert.assertEquals;

/**
 * Created by chq-amyg on 5/2/2017.
 */
public class LeftShiftArrayTest {

  @Test
  public void testSingleArray() {
    List<Integer> arr = singletonList(1);
    assertEquals(arr, leftShift(1, arr));
  }

  @Test
  public void test1() {
    assertEquals(asList(2, 3, 4, 5, 1), leftShift(1, asList(1, 2, 3, 4, 5)));
  }

  @Test
  public void testGetIndex() {
    assertEquals(1, getIndex(1, 2, 5));
    assertEquals(0, getIndex(2, 2, 5));
    assertEquals(4, getIndex(3, 2, 5));
    assertEquals(2, getIndex(3, 0, 5));
  }
}
