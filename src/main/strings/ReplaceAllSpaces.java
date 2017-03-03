package main.strings;

public class ReplaceAllSpaces {
    //Write a method to replace all spaces in a string with ‘%20’.
    public static String replace(String input) {
        if (input == null) return null;
        char[] str = input.toCharArray();
        int length = input.length(), spaceCount = 0, newLength, i =0;
        for (i = 0; i<length; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }
        //add enough space for all the spaces to be 3 characters
        newLength = length + spaceCount * 2;
        char[] newString = new char[newLength];
        for (i = length -1; i >= 0; i--) {
            if (str[i] == ' ') {
                newString[newLength - 1] = '0';
                newString[newLength - 2] = '2';
                newString[newLength - 3] = '%';
                newLength = newLength -3;
            } else {
                newString[newLength - 1] = str[i];
                newLength = newLength - 1;
            }
        }
        return String.valueOf(newString);
    }

    public static String replaceWithBuilder(String input) {
        if (input == null) return null;
        char[] inputChars = input.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (char c : inputChars) {
            if (c != ' ') {
                builder.append(c);
            } else {
                builder.append("%20");
            }
        }
        return builder.toString();
    }
}
