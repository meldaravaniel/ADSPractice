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

    public static boolean checkForAnagramSort(String wordOne, String wordTwo) {
        //return sort(wordOne) == sort(wordTwo);
        return true;
    }

    public static boolean anagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] letters = new int[256];
        int num_unique_chars = 0;
        int num_completed_t = 0;
        char[] s_array = s.toCharArray();
        for (char c : s_array) { // count number of each char in s.
            if (letters[c] == 0) ++num_unique_chars;
            ++letters[c];
        }
        for (int i = 0; i < t.length(); ++i) {
            int c = (int) t.charAt(i);
            if (letters[c] == 0) { // Found more of char c in t than in s.
                return false;
            }
            --letters[c];
            if (letters[c] == 0) {
                ++num_completed_t;
                if (num_completed_t == num_unique_chars) {
// it’s a match if t has been processed completely
                    return i == t.length() - 1;
                }
            }
        }
        return false;
    }
}
