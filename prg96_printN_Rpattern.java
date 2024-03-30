/*96.	Write a program to print the following triangle?
OUTPUT:>
Enter Range of col
6
--------Pattern---------
6
6 5
6 5 4
6 5 4 3 
6 5 4 3 2 
6 5 4 3 2 1 
 */

import java.util.Scanner;

public class prg96_printN_Rpattern {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Enter Range of col");
            int n = sc.nextInt();
            System.out.println("--------Pattern---------");
            for (int i = n; i >= 1; i--) {
                for (int j = n; j >= i; j--) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }
}
