package main.strings;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Regex {

    public static void tokenizer(String s) {
        if (s.length() == 0) return;
        if (s.length() >= 400000) return;
        if (!s.matches(".*[a-zA-Z].*")) {System.out.println(0); return; }
        String[] words = s.trim().split("[\\s!,?._'@]+");
        System.out.println(words.length);
        for (String word : words) {
            System.out.println(word);
        }
    }

    public static boolean validRegexPattern(String pattern) {
        try {
            Pattern p = Pattern.compile(pattern);
            System.out.println("Valid");
            return true;
        } catch (PatternSyntaxException e) {
            System.out.println("Invalid");
            return false;
        }
    }

    public static boolean validIPAddressPattern(String ip) {
        String pattern = "((0?[0-9]?[0-9]|1[0-9][0-9]|2[0-5][0-5]))" +
                ".((0?[0-9]?[0-9]|1[0-9][0-9]|2[0-5][0-5]))" +
                ".((0?[0-9]?[0-9]|1[0-9][0-9]|2[0-5][0-5]))" +
                ".((0?[0-9]?[0-9]|1[0-9][0-9]|2[0-5][0-5]))";
        return ip.matches(pattern);
    }

    public static String removeDupWords(String inputFull) {
        String regex = "\\b(\\w+)(\\b\\W+\\b\\1\\b)*";
        Pattern p = Pattern.compile(regex, Pattern.MULTILINE+Pattern.CASE_INSENSITIVE);
        String[] inputSplit = inputFull.split("\n");
        StringBuilder output = new StringBuilder();
        for (String input : inputSplit) {
            Matcher m = p.matcher(input);
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), "");
            }
            // Prints the modified sentence.
            output.append(input).append("\n");
        }
        return output.toString();
    }
}
