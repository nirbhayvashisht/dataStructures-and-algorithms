package Section_1_Basics;
/*
P24:
  1
 222
33333
 */
public class P24 {
    public static void main(String[] args) {
        pattern(4);
    }
    private static void pattern(int n){
        int nst,cst,csp,nsp;
        nsp=n-1;
        nst=1;
        int i=1;
        while(n>0){
            csp=1;
            while(csp<=nsp){
                System.out.print("  ");
                csp++;
            }

            cst=1;
            while(cst<=nst){
                System.out.print(i+" ");
                cst++;
            }
            System.out.println();
            i++;
            nst+=2;
            nsp--;
            n--;
        }
    }
}
