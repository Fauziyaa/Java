package com.company;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String name = "FauZiya";
        System.out.println(name);
        //Length
        int length = name.length();
        System.out.println(length);
        //ToLowerCase
        String lower = name.toLowerCase();
        System.out.println(lower);
        //ToUpperCase
        String upper = name.toUpperCase();
        System.out.println(upper);
        //Trim - remove white spaces from start and end
        String str = "    Hello    ";
        String trim = str.trim();
        System.out.println(trim);
        //Substring 1) substring(startIndex)  2)substring(startIndex endIndex-1)
        String sub1 = name.substring(3);
        System.out.println(sub1);
        String sub2 = name.substring(2, 7);
        System.out.println(sub2);
        //Replace
        String rep = name.replace('a', 'x');
        System.out.println(rep);
        System.out.println(name.replace("Ziya","abdu"));
        //StartsWith
        System.out.println(name.startsWith("Fau"));
        //EndWith
        System.out.println(name.endsWith("n"));
        //CharAt  ->Find character of given index
        System.out.println(name.charAt(0));
        //IndexOf   -> Find index of given character/string from start
        System.out.println(name.indexOf('a'));
        //IndexOf -> Find index of given character/string and starts finding from given value
        System.out.println(name.indexOf("iya", 2));
        System.out.println(name.indexOf("abcde"));      //return -1 if nothing is found
        //LastIndexOf -> Find index of given character/string from last
        System.out.println(name.lastIndexOf('a'));
        //LastIndexOf -> Find index of given character/string from last given index eg 4 = 4, 3, 2, 1, 0
        System.out.println(name.lastIndexOf('u', 4));
        //Equals
        System.out.println(name.equals("fauziya"));
        //Equals Ignore Case -> ignore case
        System.out.println(name.equalsIgnoreCase("FaUZiyA"));





    }
}
