package Section_1_Basics;
//print the GCD(Greatest common divisor) of 2 numbers
import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        int num1 = scn.nextInt();

        System.out.print("Enter number 2 : ");
        int num2 = scn.nextInt();

        System.out.print("GCD : "+gcd(num1,num2));

    }

    public static int gcd(int divisor,int dividend){
        int remainder= 0;
        while(dividend%divisor!=0){
            remainder = dividend % divisor;
            dividend = divisor;
            divisor = remainder;
        }
        return divisor;
    }
}
