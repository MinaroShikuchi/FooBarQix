package com.societegenerale;

public class Main {
    public static String compute(String myString) {
        String res = "";
        int myInt =  Integer.parseInt(myString);

        if (myInt % 3 == 0) {
            res = "Foo";
        }
        if (myInt % 5 == 0) {
            res += "Bar";
        }
        if (myInt % 7 == 0) {
            res += "Qix";
        }

        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == '0') {
                res += "*";
            } else if (myString.charAt(i) == '3') {
               res += "Foo";
            } else if (myString.charAt(i) == '5') {
                res += "Bar";
            } else if (myString.charAt(i) == '7') {
                res += "Qix";
            }
        }

        if (res == "" || res.compareTo("*") == 0) return myString.replace('0','*');
        return res;
    }
    public void main(String[] args) {
        System.out.println("Hello");
    }
}