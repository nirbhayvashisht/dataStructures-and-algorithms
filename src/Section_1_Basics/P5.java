package Section_1_Basics;
/*
P5:
* * *
  * *
    *
 */
public class P5 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n,0);
    }

    public static void pattern(int n,int spc){
        if (n==0){
            return;
        }

        for (int i = 0;i<spc;i++){
            System.out.print("  ");
        }
        for (int i = 0;i<n;i++){
            System.out.print("* ");
        }
        System.out.println();
        pattern(n-1,spc+1);
    }
}
