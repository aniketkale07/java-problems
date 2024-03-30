/*104.	Write a program to print the following triangle?
OUTPUT:>
Enter the Range: 
5
-----------pattern------------
5
4 5
3 4 5
2 3 4 5 
1 2 3 4 5
 */

import java.util.Scanner;

public class prg104_RTprint_pattern {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Enter the Range: ");
            int n = sc.nextInt();
            System.out.println("-----------pattern------------");
            for (int i = n; i >= 1; i--) {
                for (int j = i; j <= n; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }
}
