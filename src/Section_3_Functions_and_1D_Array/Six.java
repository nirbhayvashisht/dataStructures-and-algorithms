package Section_3_Functions_and_1D_Array;

import java.util.Scanner;

public class Six {
    private static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the size of the array : ");
        int size = scn.nextInt();
        int arr[] = new int[size];
        inputArray(arr);
        System.out.print("Enter number to be seerched : ");
        int num = scn.nextInt();

        int index = binarySearch(arr,num);
        if (index==-1){
            System.out.println("Number does not exist");
        }else{
            System.out.println("Number exists at index : "+index);
        }
    }

    private static void inputArray(int[] arr){
        System.out.println("Enter Sorted Elements:");
        for(int i = 0;i<arr.length;i++){
            System.out.print("Enter element of index " + i +" : ");
            arr[i]=scn.nextInt();
        }
        System.out.println();
    }

    private static int binarySearch(int[] arr,int num){
        int beg=0;
        int end = arr.length-1;

        while (beg<=end){
            int mid = (beg+end)/2;
            if(arr[mid]==num){
                return mid;
            }
            if(num<arr[mid]){
                end = mid -1;
            }else{
                beg = mid +1;
            }
        }
        return -1;
    }
}
