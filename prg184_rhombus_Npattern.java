/*184.	Write a program to print the following rhombus pattern?
OUTPUT:>
Enter the Range of n
5
---------Pattern---------

    1
   2 2 
  3 3 3
 4 4 4 4
5 5 5 5 5
 4 4 4 4
  3 3 3
   2 2 
    1 */

import java.util.Scanner;

public class prg184_rhombus_Npattern {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter the Range of n");
            int n=sc.nextInt();
            System.out.println("---------Pattern---------");
            for(int i=0;i<n;i++){
                for(int k=0;k<n-i;k++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print(i+" ");
                }System.out.println();
            }
            for(int i=n;i>=1;i--){
                for(int j=n-i;j>0;j--){
                    System.out.print(" ");
                }
                for(int k=i;k>=1;k--){
                    System.out.print(i+" ");
                }System.out.println();
            }
        }
    }
}
