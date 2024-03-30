/*95.	Write a program to print the following triangle?
Enter the Range:
5
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5
 */

import java.util.Scanner;

public class prg95_printN_Rpattern {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Enter the Range:");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = n; j >= i; j--) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }
}
