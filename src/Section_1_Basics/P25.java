package Section_1_Basics;
/*
P25:
  1
 234
56789
 */
public class P25 {
    public static void main(String[] args) {
        pattern(4);
    }
    private static void pattern(int n){
        int nst,cst,csp,nsp,i=1;
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
                System.out.print(i+" ");
                i++;
                cst++;
            }
            System.out.println();
            nst+=2;
            nsp--;
            n--;
        }
    }
}
