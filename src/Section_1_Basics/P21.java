package Section_1_Basics;
/*
P21:
*       *
* *   * *
* * * * *
 */
public class P21 {
    public static void main(String[] args) {
        pattern(5);
    }
    private static void pattern(int n){
        int nst,cst,nsp,csp,row=1;
        nsp = 2*n -3;
        nst=1;
        while(row<=n){
            cst=1;
            if(row==n){
                cst++;
            }
            while(cst<=nst){
                System.out.print("* ");
                cst++;
            }

            csp=1;
            while(csp<=nsp){
                System.out.print("  ");
                csp++;
            }

            cst=1;
            while(cst<=nst){
                System.out.print("* ");
                cst++;
            }
            System.out.println();
            nst++;
            nsp-=2;
            row++;
        }
    }
}
