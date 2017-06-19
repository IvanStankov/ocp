package com.ivan.learning.ocp.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String regex = "\\p{Lower}";
        String input = "LOloLO";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        boolean matches = matcher.find();
        System.out.println("Input matches pattern: " + matches);
        if (matches) {
            System.out.println(matcher.group());
        }
    }

}
