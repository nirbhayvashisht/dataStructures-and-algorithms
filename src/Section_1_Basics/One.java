package Section_1_Basics;
//Wap to calculate simple interest
import java.util.Scanner;

public class One {
    private static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        getInputs();
    }

    private static void getInputs(){
        //takes inputs from the user
        System.out.println("Enter Principal: ");
        double p = scn.nextDouble();

        System.out.println("Enter Rate: ");
        float r = scn.nextFloat();

        System.out.println("Enter Time: ");
        int t = scn.nextInt();

        calcSimpleInterest(p,r,t);
    }

    public static void calcSimpleInterest(double p,float r, int t ){
        //calculate simple interest
        double si = (p*r*t)/100;
        System.out.println("Simple Interest: "+si);
    }
}
