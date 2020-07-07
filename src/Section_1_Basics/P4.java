package Section_1_Basics;
/*
     *
   * *
 * * *
 */
public class P4 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n,1);
    }

    public static void pattern(int n,int i){
        if (n==0){
            return;
        }
        for(int j = 1;j<=n;j++){
            System.out.print("  ");
        }
        for (int j=1;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
        pattern(n-1,i+1);
    }
}
