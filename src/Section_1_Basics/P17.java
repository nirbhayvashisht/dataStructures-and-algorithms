package Section_1_Basics;
/*
P17: for n = 7
* * *  * * *
* *      * *
*          *

*          *
* *      * *
* * *  * * *
 */
public class P17 {
    public static void main(String[] args) {
        int n= 7;
        pattern(n);
    }
    private static void pattern(int n){
        int cst,nst,csp,nsp,row,nr;
        nst = n/2;
        nsp = 1;
        nr = n;
        row = 1;
        while(row<=nr){
            cst=1;
            while (cst<=nst){
                System.out.print("* ");
                cst++;
            }

            csp = 1;
            while(csp<=nsp){
                System.out.print("  ");
                csp++;
            }

            cst=1;
            while (cst<=nst){
                System.out.print("* ");
                cst++;
            }
            System.out.println();
            if(row<=nr/2){
                nst--;
                nsp+=2;
            }else{
                nst++;
                nsp-=2;
            }
            row++;
        }

    }
}
