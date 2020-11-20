package edu;

public class ThousandSeparator {

    public static void main(String[] args) {
        int n = 1247500;
        String str = String.format("%,d", n);


        System.out.println(str);

    }

}
