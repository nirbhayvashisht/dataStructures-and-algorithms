package Section_1_Basics;
/*
P13: for n = 4
*
* *
* * *
* * * *
* * *
* *
*
 */
public class P13 {
    public static void main(String[] args) {
        int n = 4;
        int nr = 2*n -1 ;
        int nst=1,cst,row=1;
        while(row<=nr){
            cst =1;
            while(cst<=nst){
                System.out.print("* ");
                cst++;
            }
            System.out.println();
            if (row<=nr/2){
                nst++;
            }else{
                nst--;
            }
            row++;
        }
    }
}
