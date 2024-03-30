/*Write a program to print the following triangle.. 
 * OUTPUT:>
  
Enter the Range: 
5
-------------Pattern-----------
1 2 3 4 5
 1 2 3 4
  1 2 3
   1 2
    1 
*/


import java.util.Scanner;

public class prg98_print_Triangle {
   public static void main(String[] args) {
    try(Scanner sc=new Scanner(System.in);){
        System.out.println("Enter the Range: ");
        int n=sc.nextInt();
        System.out.println("-------------Pattern-----------");
        for(int i=n;i>=1;i--){
            for(int k=n-i;k>=1;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }System.out.println();
        }
    }
   } 
}
