package Section_1_Basics;
//To check if the number is prime or not
import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime or not: ");
        int n = scn.nextInt();
        if (isPrime(n)){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
    private static boolean isPrime(int n){
        int flag=0;
        for (int i = 2; i<=Math.sqrt(n);i++){
            if (n%i==0){
                flag=1;
                break;
            }
        }
        return flag ==0;
    }
}
