package com.societegenerale;

public class Main {
    public static String compute(String myString) {
        StringBuilder res = new StringBuilder();
        int myInt =  Integer.parseInt(myString);

        if (myInt % 3 == 0) res.append("Foo");
        if (myInt % 5 == 0) res.append("Bar");
        if (myInt % 7 == 0) res.append("Qix");

        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == '0') res.append("*");
            else if (myString.charAt(i) == '3') res.append("Foo");
            else if (myString.charAt(i) == '5') res.append("Bar");
            else if (myString.charAt(i) == '7') res.append("Qix");
        }

        if (res.toString().equals("") || res.toString().compareTo("*") == 0) return myString.replace('0','*');
        return res.toString();
    }
}