/*47.	Write a program to find the sum of even ‘n’ natural numbers?
 * OUTPUT:>
 * Enter the value of n
5
The addition of even Natural Number: 6

 */

import java.util.Scanner;

public class prg47_even_natural_nnumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Enter the value of n");
            int sum = 0;
            int n = sc.nextInt();
            for (int i = 2; i <= n; i += 2) {
                sum += i;
            }
            System.out.println("The addition of even Natural Number: " + sum);

        }
    }
}
