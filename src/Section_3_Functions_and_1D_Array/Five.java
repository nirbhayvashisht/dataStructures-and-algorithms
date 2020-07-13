package Section_3_Functions_and_1D_Array;

import java.util.Scanner;

public class Five {
    private static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the size of the array : ");
        int size = scn.nextInt();
        int arr[] = new int[size];
        inputArray(arr);
        System.out.print("Enter numbere to be seerched : ");
        int num = scn.nextInt();
        int index = linearSearch(arr,num);
        if (index==-1){
            System.out.println("Number does not exist");
        }else{
            System.out.println("Number exists at index : "+index);
        }
    }

    private static void inputArray(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print("Enter element of index " + i +" : ");
            arr[i]=scn.nextInt();
        }
        System.out.println();
    }

    private static int linearSearch(int[] arr,int num){
        int flag = -1;
        for(int i = 0;i<arr.length;i++){
            if (arr[i]==num){
                flag = i;
                break;
            }
        }
        return flag;
    }
}
