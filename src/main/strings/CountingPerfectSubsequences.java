package main.strings;

/**
 * Created by chq-amyg on 5/2/2017.
 *
 * ORIGINAL PROBLEM PROMPT
 * <p>
 * We call a string, s, consisting of the letters in the set {a, b, c, d} a perfect string if both the conditions below are true:
 * #(a) == #(b)
 * #(c) == #(d)
 * <p>
 * where #(x) denotes the number of occurrences of character x in s.
 * <p>
 * For example, the string "abacadbbcd" is a perfect string because it has 3a's, 3b's, 2c's and 2d's.
 * <p>
 * ***The Problem***
 * <p>
 * Solve q queries, where each query consists of a string, s.
 * For each query, print the number of non-empty subsequences of that are perfect strings.
 * As this number can be very large, print it modulo 10^9 + 7 (1000000007).
 * <p>
 * ***Input Format***
 * <p>
 * The first line contains an integer, q, denoting the number of queries.
 * Each of the q subsequent lines contains string s for a query.
 * <p>
 * ***Constraints***
 * <p>
 * 1 <= q <= 5
 * 1 <= length(s) <= 5*10^5
 * String s consists of one or more of the following characters: a, b, c, and d.
 * <p>
 * ***Subtask***
 * For 40% of the total score, 1 <= length(s) <= 4000.
 * <p>
 * ***Output Format***
 * <p>
 * For each s, print the number of non-empty subsequences of s that are perfect strings, modulo 10^9 + 7, on a new line.
 * <p>
 * ***Sample Input 0***
 * 3
 * abcd
 * cad
 * dcc
 * <p>
 * ***Sample Output 0***
 * 3
 * 1
 * 2
 * <p>
 * ***Explanation 0***
 * <p>
 * We peform the following q=3 queries:
 * <p>
 * 1. s = "abcd" has 3 non-empty perfect subsequences: "ab", "cd", and "abcd". Thus, the answer is 3.
 * 2. s = "cad" has 1 non-empty perfect subsequence: "cd". Thus, the answer is 1.
 * 3. s = "dcc" has 2 non-empty perfect subsequences: "dc" and "dc". Note that, while both these strings contain the same characters,
 * they are distinct subsequences of s (i.e. s(0)s(1), and s(0)s(2)). Thus, the answer is 2.
 *
 * NOTES:
 * to make it easier to test, I'm taking away the main method and making this class just have a public static method that takes a string.
 */
public class CountingPerfectSubsequences {

  private static final int MOD = 1000000007;

  public static long countSubs(String s) {
    // Complete this function
    if(s.length() == 1) {
      return 0;
    }
    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'a') {
        a++;
      }
      if (s.charAt(i) == 'b') {
        b++;
      }
      if (s.charAt(i) == 'c') {
        c++;
      }
      if (s.charAt(i) == 'd') {
        d++;
      }
    }
    long subseq = 0;
    subseq += getSubSeq(a, b);
    subseq += getSubSeq(c, d);
    subseq += (a * b * c * d);
    return subseq % MOD;
  }

  private static long getSubSeq(int one, int two) {
    if (one == two) {
      return equalSeq(one);
    }
    if (one >= two) {
      return notEqualSeq(two, one);
    }
    return notEqualSeq(one, two);
  }

  /**
   * If the number of is 0 - 2, that's an edge case.
   * otherwise, this one is a series of
   * n^2 + (n-1)^2 + ... + (n-n)^2
   *
   * @param n the number of occurrences of the chars in the string.
   * @return the number of perfect subsequences of two chars having the same number
   * in a string.
   */
  public static long equalSeq(int n) {
    if(n <= 1) {
      return n;
    }
    if(n == 2) {
      return 3;
    }
    long count = 0;
    for (int i = 0; i < n; i++) {
      count += Math.pow(n - i, 2);
    }
    return count;
  }

  /**
   *
   * @param lesser has to be less than greater and greater than zero
   * @param greater has to be greater than lesser
   * @return the number of perfect subsequences of two chars having the lesser and greater occurrences in a string.
   */
  public static long notEqualSeq(int lesser, int greater) {
    if(lesser >= greater || lesser == 0) {
      throw new IllegalArgumentException("The lesser number must actually be lesser and not zero!");
    }
    if(lesser == 1) {
      return greater;
    }
    long count = lesser * greater;
    count += notEqualSeq(lesser - 1, greater - 1);
    return count;
  }

}
