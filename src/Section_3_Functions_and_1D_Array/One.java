package Section_3_Functions_and_1D_Array;

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Source Number: ");
        int n = scn.nextInt();

        System.out.print("Enter Source Base: ");
        int  b= scn.nextInt();

        System.out.print("Decimal Number: "+anybaseToDecimal(n,b));

    }

    private static int anybaseToDecimal(int n, int b){
        int rem=0;
        int num=0,i=0;
        while(n%10!=0){
            rem = n%10;
            n/=10;
            num+=rem*Math.pow(b,i);
            i++;
        }
        return num;
    }
}
