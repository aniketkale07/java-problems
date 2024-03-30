/*105.	Write a program to print the following triangle?
OUTPUT:>
ENter the Range:
6
-------------Pattern------------

    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
 */
import java.util.Scanner;

public class prg105_print_triangle {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("ENter the Range:");
            int n=sc.nextInt();
     System.out.println("-------------Pattern------------");
            for(int i=0;i<n;i++){
                for(int k=n-i;k>1;k--){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print(i+" ");
                }System.out.println();
            }
        }
    }
}
