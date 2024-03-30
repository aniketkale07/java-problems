/*
183.	Write a program to print the following rhombus pattern?
OUTPUT:>
Enter no of rows: 
5
---------Pattern----------

    *
   * *
  * * *
 * * * *
* * * * * 
 * * * *
  * * *
   * *
    * 
 
    */

import java.util.Scanner;

public class prg183_rhombus_pattern {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Enter no of rows: ");
            int n = sc.nextInt();
            
System.out.println("---------Pattern----------");              
              for(int i=0;i<n;i++){
              for(int j=n-i;j>0;j--){
              System.out.print(" ");
              }for(int k=0;k<i;k++){
              System.out.print("* ");
              }System.out.println();
              }
             

            for (int i = n; i >= 1; i--) {
                for (int j = n-i; j >0; j--) {
                    System.out.print(" ");
                }
                for (int k = i; k > 0; k--) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }
    }
}
