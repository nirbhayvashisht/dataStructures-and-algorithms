package Section_1_Basics;
//find the sum of n natural numbers
import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scn.nextInt();
        int sum = sumOfNNaturalNumbers(n);
        System.out.println("Sum of "+n+" natural numbers is "+sum);
    }

    private static int sumOfNNaturalNumbers(int n){
        if (n==0){
            return 0;
        }
        return n + sumOfNNaturalNumbers(n-1);
    }
}
