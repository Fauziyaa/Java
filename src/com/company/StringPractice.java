package com.company;

import java.util.Locale;

public class StringPractice {
    public static void main(String[] args) {
        //Problem 1 -> convert string into lowercase
        String name = "Nick Jones";
        name = name.toLowerCase();
        System.out.println(name);

        //Problem 1 -> replace spaces with underscore
        String text = "My Best Friend";
        text = text.replace(" ", "_");
        System.out.println(text);

        //Problem 3 -> Replace <|name|> with a string (some name)
        String letter = "Dear <|name|>, Thanks a lot";
        letter = letter.replace("<|name|>", "Fauziya");
        System.out.println(letter);

        //Problem 4 -> Detect double and triple spaces in string
        String spaces = "This string contains  double and    triple spaces";
        System.out.println(spaces.indexOf("  "));
        System.out.println(spaces.indexOf("   "));

        //Problem 5 ->
        String myLetter = "Dear Harry,\n\tThis \"Java\" Course is nice.\n\tThanks.";
        System.out.println(myLetter);
    }
}
