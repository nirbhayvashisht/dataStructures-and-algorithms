package Section_3_Functions_and_1D_Array;

public class Three {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        printArray(arr);
        swap(arr,0,3);
        System.out.println("After Swap");
        printArray(arr);
    }

    private static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    private static void printArray(int[] arr){
        for(int val: arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }
}
