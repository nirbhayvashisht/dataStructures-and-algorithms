package Section_3_Functions_and_1D_Array;

import java.util.Scanner;

public class Four {
    private static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter the size of the array : ");
        int size = scn.nextInt();
        int arr[] = new int[size];
        inputArray(arr);
        int max = maxElement(arr);
        System.out.println("Max element is : "+max);
    }

    private static void inputArray(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print("Enter element of index " + i +" : ");
            arr[i]=scn.nextInt();
        }
        System.out.println();
    }

    private static int maxElement(int[] arr){
        int max = arr[0];
        for(int i = 0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
