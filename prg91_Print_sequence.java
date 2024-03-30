/*91.	Write a program to print the following triangle?
OUTPUT:>
Enter no of rows: 
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
 */
// package 

import java.util.Scanner;

public class prg91_Print_sequence {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Enter no of rows: ");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
    }
}
