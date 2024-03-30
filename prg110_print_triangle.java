/*
107.	Write a program to print the following triangle?
OUTPUT:>
Enter the Range:
5
---------Pattern---------
  5 5 5 5 5  
   4 4 4 4   
    3 3 3
     2 2
      1
 */
import java.util.Scanner;

public class prg110_print_triangle {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter the Range:");
            int n=sc.nextInt();
            System.out.println("---------Pattern---------");
            for(int i=n;i>=1;i--){
                for(int j=n;j>i;j--){
                    System.out.print(" ");
                }
                for(int k=i;k>=1;k--){
                    System.out.print(" "+i);
                }System.out.println();
            }
        }
    }
}
