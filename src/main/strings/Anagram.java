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

    public static boolean anagram(String wordOne, String wordTwo) {
        if (wordOne.length() != wordTwo.length()) return false;
        int[] letters = new int[256]; //array to hold chars at index, int as values
        int num_unique_chars = 0; //track total unique chars
        int num_completed_t = 0; //track completed chars
        char[] s_array = wordOne.toCharArray();
        for (char c : s_array) { // count number of each char in s.
            if (letters[c] == 0) ++num_unique_chars;
            ++letters[c]; //add number of occurences of each unique char
        }
        for (int i = 0; i < wordTwo.length(); ++i) {
            int charIndex = (int) wordTwo.charAt(i); //find the int value of the char
            if (letters[charIndex] == 0) {
                return false;// found a letter that is not in wordOne
            }
            --letters[charIndex]; // reduce the number of occurences
            if (letters[charIndex] == 0) { //if that was the last one mark it complete
                ++num_completed_t;
                if (num_completed_t == num_unique_chars) { //number of letters match
// it’s a match if t has been processed completely
                    return i == wordTwo.length() - 1;
                }
            }
        }
        return false;
    }

    public static boolean anagram2(String wordOne, String wordTwo) {
        if (wordOne.length() != wordTwo.length()) return false;
        int[] letters = new int[256]; //array to hold chars at index, int as values
        char[] s_array = wordOne.toCharArray();
        for (char c : s_array) { // count number of each char in s.
            ++letters[c]; //add number of occurrences of each unique char
        }
        for (int i = 0; i < wordTwo.length(); ++i) {
            int charIndex = (int) wordTwo.charAt(i); //find the int value of the char
            if (letters[charIndex] == 0) {
                return false;// found a letter that is not in wordOne
            }
            --letters[charIndex]; // reduce the number of occurrences
            if (letters[charIndex] == -1) { //if there are too many its not the same
                return false;
            }
        }
        return true;
    }
}
