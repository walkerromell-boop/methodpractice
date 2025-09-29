package com.pluralsight;

public class CompareNumbers {
    public static void main(String[] args) {
        int testnumber=1234;
        boolean results = isEven(testnumber);
        System.out.println(results);
        System.out.println(isEven(5));

        int newnum= 255;
        boolean positive= isPositive(newnum);
        System.out.println(positive);
        System.out.println(isPositive(100));

    }
    public static boolean isEven(int number){
        return number % 2==0;
    }


    public static boolean isPositive(double number){
     return number >0;
    }


}
