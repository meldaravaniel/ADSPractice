package main.strings;

import java.util.ArrayList;

/**
 * Created by user on 2/26/2017.
 */
public class AllPermuationsOfAString {

    public static ArrayList<String> getAllPermutations(String s) {
        System.out.println("Method call: " + s);
        // The result
        ArrayList<String> listOfPermutations = new ArrayList<String>();
        // If input string's length is 1, return {s}
        if (s.length() == 1) {
            listOfPermutations.add(s);
        } else if (s.length() > 1) {
            int lastIndex = s.length() - 1;
            // Find out the last character
            String last = s.substring(lastIndex);
            // Rest of the string
            String rest = s.substring(0, lastIndex);
            // Perform permutation on the rest string and
            // merge with the last character

            listOfPermutations = merge(getAllPermutations(rest), last);
        }
        System.out.println("Returning: " + listOfPermutations);
        return listOfPermutations;
    }

    /**
     * @param list a result of permutation, e.g. {"ab", "ba"}
     * @param c    the last character
     * @return     a merged new list, e.g. {"cab", "acb" ... }
     */
    public static ArrayList<String> merge(ArrayList<String> list, String c) {
        ArrayList<String> res = new ArrayList<String>();
        // Loop through all the string in the list
        for (String s : list) {
            // For each string, insert the last character to all possible positions
            // by adjusting the offset of the insert point each iteration
            // and add them to the new list
            for (int i = 0; i <= s.length(); ++i) {
                String ps = new StringBuffer(s).insert(i, c).toString();
                res.add(ps);
                System.out.println("Merge: " + res);
            }
        }
        return res;
    }
}
