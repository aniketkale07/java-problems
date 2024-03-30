/*106.	Write a program to print the following triangle?
OUTPUT:> 
Enter Range: 
5
---------Pattern----------
     5
    4 4
   3 3 3
  2 2 2 2
 1 1 1 1 1
 */
import java.util.Scanner;

public class prg106_print_triangle {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter Range: ");
            int n=sc.nextInt();
            System.out.println("---------Pattern----------");
            for(int i=n;i>=1;i--){
                for(int j=n;j>n-i;j--){
                    System.out.print(" ");
                }for(int k=n;k>=i;k--){
                    System.out.print(i+" ");
                }System.out.println(

                );
            }
        }
    }
}
