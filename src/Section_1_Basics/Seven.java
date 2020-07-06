package Section_1_Basics;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number to be reversed: ");
        int n = scn.nextInt();
        simpleReverse(n);
        reverse(n);
    }

    private static void simpleReverse(int n){
        //convert integer to a String
        String str = String.valueOf(n);
        //create a String Builder using that string because Stings are immutable
        StringBuilder string = new StringBuilder(str);
        //reverse that string builder and convert it to String
        String rev_string = string.reverse().toString();
        //convert that string back to an integer
        int rev = Integer.parseInt(rev_string);
        System.out.println("From simpleReverse() : "+rev);
    }

    private static void reverse(int n){
        int rev = 0;
        while(n>0){
            rev = (rev*10) + (n%10);
            n/=10;
        }
        System.out.println("From reverse() : "+rev);
    }
}
