package Section_3_Functions_and_1D_Array;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int n = scn.nextInt();

        System.out.print("Enter the destination base: ");
        int b = scn.nextInt();

        System.out.print("Decimal Number: "+decimalToAnyBase(n,b));
    }

    private static int decimalToAnyBase(int n,int b){
        int rem=0;
        int num=0,i=0;
        while(n%b!=0){
            rem=n%b;
            n/=b;
            num+=rem*Math.pow(10,i);
            i++;
        }
        return num;
    }
}
