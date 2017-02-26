package main.strings;


public class Anagram {

    public static boolean checkForAnagram(String wordOne, String wordTwo) {
        char[] lettersFromOne = wordOne.toCharArray();
        if (wordOne.length() != wordTwo.length()) return false;
        for (char letter : lettersFromOne) {
            int index = wordTwo.indexOf(letter);
            if (index != -1) {
                wordTwo = wordTwo.substring(0, index) + wordTwo.substring(index + 1, wordTwo.length());
            } else {
                return false;
            }
        }
        return true;
    }
}
