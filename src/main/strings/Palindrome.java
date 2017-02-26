package main.strings;

/**
 * Created by kgresmer on 12/26/2016.
 */

public class Palindrome {

    public static boolean checkForPalindrome(String input) {
            char[] letters = input.toLowerCase().toCharArray();
            for (int i = 0; i < (letters.length/2); i++) {
                if (letters[i] != letters[letters.length - (1 + i)]) {
                    return false;
                }
            }
            return true;
    }
}
