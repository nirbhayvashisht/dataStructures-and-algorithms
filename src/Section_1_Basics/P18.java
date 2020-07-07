package Section_1_Basics;
/*
P18: for n = 5
  *
 ***
*****
 ***
  *
 */
public class P18 {
    public static void main(String[] args) {
        int n = 5;
        pattern(n);

    }

    private static void pattern(int n){
        int nst,cst,nsr,row,nr,csp,nsp;
        row = 1;
        nr = n;
        nst = 1;
        nsp = n/2;
        while(row<=nr){
            csp = 1;
            while(csp<=nsp){
                System.out.print("  ");
                csp++;
            }
            cst = 1;
            while(cst<=nst){
                System.out.print("* ");
                cst++;
            }
            System.out.println();
            if(row<=nr/2){
                nsp--;
                nst+=2;
            }else{
                nsp++;
                nst-=2;
            }
            row++;
        }
    }
}
