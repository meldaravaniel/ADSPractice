package main.strings;

/**
 * Created by chq-keving on 3/1/2017.
 */
public class CStyleStringReverse {

    //Write code to reverse a C-Style String.
    // (C-String means that “abcd” is represented as
    // five characters, including the null character.)
    public static String reverse(String input) {
        StringBuilder builder = new StringBuilder();
        builder.append("");
        for (int i = input.length() - 1; i >= 0; i--) {
            builder.append(input.charAt(i));
        }
        return builder.toString();
    }
}
