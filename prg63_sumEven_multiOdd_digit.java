/*QUE. 63.Write aprogram  to accept maximum 6 digit of number and find out the sum of
 even digit of that number and Multiplication of odd digit of that number.
 OUTPUT:>

Enter the 6 digit number: 
458756
 Given Number: 458756
Sum of Even number: 18
Multiplication of Odd Number: 175
 * 
 */

import java.util.Scanner;

public class prg63_sumEven_multiOdd_digit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Enter the 6 digit number: ");
            int n = sc.nextInt();
            int num = n, even = 0, odd = 1, a;
            while (n > 0) {
                a = n % 10;
                n = n / 10;
                if (a % 2 == 0) {
                    even += a;
                } else {
                    odd *= a;
                }
            }
            System.out.println(" Given Number: " + num);
            System.out.println("Sum of Even number: " + even + "\nMultiplication of Odd Number: " + odd);

        }
    }
}
