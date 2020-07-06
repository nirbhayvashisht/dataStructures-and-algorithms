package Section_1_Basics;
//print n numbers of the fibonacci series
import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number of terms (n) : ");
        int n = scn.nextInt();
        fibonacci(n,0,1);
    }

    public static void fibonacci(int n,int a,int b){
        if (n==0){
            return;
        }
        System.out.println(a);
        fibonacci(n-1,b,b+a);
    }
}
