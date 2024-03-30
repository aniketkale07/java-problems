/*Write a program to print the following triangle..
 * OUTPUT:>
 * 
Enter the Range: 
5
-------------Pattern---------
    1
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5
 */

import java.util.Scanner;

public class prg109_Print_Triangle {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter the Range: ");
   int n=sc.nextInt();
   System.out.println("-------------Pattern---------");
   for(int i=1;i<=n;i++){
    for(int j=n-i;j>=1;j--){
        System.out.print(" ");
    }
    for(int k=1;k<=i;k++){
        System.out.print(k+" ");
    }System.out.println();
   }
        }
    }
}
