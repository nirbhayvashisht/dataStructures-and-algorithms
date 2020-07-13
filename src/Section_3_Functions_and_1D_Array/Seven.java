package Section_3_Functions_and_1D_Array;

import java.util.Scanner;

public class Seven {
    private static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the size of the array : ");
        int size = scn.nextInt();
        int arr[] = new int[size];
        inputArray(arr);
        printArray(arr);
        bubbleSort(arr);
        printArray(arr);

    }

    private static void inputArray(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print("Enter element of index " + i +" : ");
            arr[i]=scn.nextInt();
        }
        System.out.println();
    }

    private static void printArray(int[] arr){
        System.out.println();
        for(int val: arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }

    private static void bubbleSort(int[] arr){
        int temp;
        for (int i = 0; i <arr.length-1; i++){
            for (int j=0; j< arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

}
