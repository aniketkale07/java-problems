/*QUE > 52. Write a program to Multiplication Table:>
 * OUTPUT:>
 *  
Enter the Range: 
5
--------Multiplication Table-----------
5
10
15
20
25
30
35
40
45
50
 */

import java.util.Scanner;

public class prg52_multiplication_table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Range: ");
        int n=sc.nextInt();
        System.out.println("--------Multiplication Table-----------");
         for(int i=1;i<11;i++){
            System.out.println(n*i);
         }

    }
}
 