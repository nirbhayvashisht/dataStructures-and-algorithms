package Section_1_Basics;
/*
*
* *
* * *
 */
public class P2 {
    public static void main(String[] args) {
        int n = 5;
        int nst=1,cst,row=1;
        while(row<=n){
            cst =1 ;
            while (cst<=nst){
                System.out.print("* ");
                cst++;
            }
            System.out.println();
            nst++;
            row++;
        }
    }
}
