package Section_1_Basics;
// Find if the number is odd or even
import java.util.Scanner;

public class Two {
    private static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        int num = scn.nextInt();
        if (isEven(num)){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

    private static boolean isEven(int num){
        //it will return true if even, false if odd
        return num%2==0;
    }
}
