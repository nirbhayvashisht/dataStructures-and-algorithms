package Section_1_Basics;
/*
P23:
  1
 111
11111
 */
public class P23 {
    public static void main(String[] args) {
        pattern(4);
    }
    private static void pattern(int n){
        int nst,cst,csp,nsp;
        nsp=n-1;
        nst=1;
        while(n>0){
            csp=1;
            while(csp<=nsp){
                System.out.print("  ");
                csp++;
            }

            cst=1;
            while(cst<=nst){
                System.out.print("1 ");
                cst++;
            }
            System.out.println();
            nst+=2;
            nsp--;
            n--;
        }
    }
}
