package test.strings;

import org.junit.Test;

import static main.strings.CountingPerfectSubsequences.countSubs;
import static main.strings.CountingPerfectSubsequences.equalSeq;
import static main.strings.CountingPerfectSubsequences.notEqualSeq;
import static org.junit.Assert.assertEquals;

/**
 * Created by chq-amyg on 5/2/2017.
 *
 * NOTE: none of these tests is correct...the real solution is WAY more complicated.
 */
public class CountingPerfectSubsequencesTest {

  @Test
  public void testOneChar() {
    assertEquals(0, countSubs("a"));
    assertEquals(0, countSubs("b"));
    assertEquals(0, countSubs("c"));
    assertEquals(0, countSubs("d"));
  }

  @Test
  public void testMiniSubsequences() {
    assertEquals(1, countSubs("ab"));
    assertEquals(1, countSubs("cd"));
    assertEquals(3, countSubs("abcd"));
    assertEquals(6, countSubs("aabb"));
    assertEquals(6, countSubs("ccdd"));
  }

  @Test
  public void allEqual() {
    assertEquals(mod(55), countSubs("aaaaabbbbb"));
    assertEquals(mod(55), countSubs("cccccddddd"));
  }

  @Test
  public void notEqual() {
    assertEquals(mod(70), countSubs("aaaaaabbbbb"));
    assertEquals(mod(70), countSubs("ccccccddddd"));
  }

  @Test
  public void mostComplicated() {
    assertEquals(mod(24), countSubs("aabbccdd"));
  }


  @Test
  public void testEqualSeq() {
    assertEquals(0, equalSeq(0));
    assertEquals(1, equalSeq(1));
    assertEquals(3, equalSeq(2));
    assertEquals(14, equalSeq(3));
    assertEquals(30, equalSeq(4));
  }

  @Test(expected=IllegalArgumentException.class)
  public void testNotEqualSeqValidation() {
    notEqualSeq(0, 1);
    notEqualSeq(0, 0);
  }

  @Test
  public void testNotEqualSeq() {
    assertEquals(2, notEqualSeq(1, 2));
    assertEquals(3, notEqualSeq(1, 3));
    assertEquals(8, notEqualSeq(2, 3));
    assertEquals(11, notEqualSeq(2, 4));
    assertEquals(20, notEqualSeq(3, 4));
    assertEquals(26, notEqualSeq(3, 5));
    assertEquals(44, notEqualSeq(3, 8));
  }

  private long mod(int i) {
    return i % 1000000007;
  }
}
