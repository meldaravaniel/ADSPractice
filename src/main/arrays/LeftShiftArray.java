package main.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chq-amyg on 5/2/2017.
 */
public class LeftShiftArray {

  public static List<Integer> leftShift(int shifts, List<Integer> arr) {
    int len = arr.size();
    int mod = shifts % len;

    if (mod == 0) {
      return arr;
    } else {
      List<Integer> temp = new ArrayList<>(len);
      for (int i = 0; i < len; i++) {
        temp.add(i, arr.get(getIndex(mod, i, arr.size())));
      }
      return temp;
    }
  }

  public static int getIndex(int mod, int i, int len) {
    if (i >= mod) {
      return i - mod;
    }
    return len - 1 + (i - mod);
  }
}

