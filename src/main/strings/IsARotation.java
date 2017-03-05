package main.strings;

/**
 * Created by kgresmer on 3/5/2017.
 */
public class IsARotation {
    //Assume you have a method isSubstring which checks if one word is a substring of
    //another. Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using
    //only one call to isSubstring (i.e., “waterbottle” is a rotation of “erbottlewat”).
    public static boolean rotation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        String testerString = s2 + s2;
        System.out.println(testerString);
        return testerString.contains(s1);
    }
}
