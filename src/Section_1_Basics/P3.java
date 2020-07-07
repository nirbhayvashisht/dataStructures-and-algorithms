package Section_1_Basics;
/*
 * * *
 * *
 *
 */
public class P3 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);
    }

    public static void pattern(int n){
        if (n==0){
            return;
        }
        for (int i = 0;i<n;i++){
            System.out.print("* ");
        }
        System.out.println();
        pattern(n-1);
    }
}
