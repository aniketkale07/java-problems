/*
102.	Write a program to print the following triangle?
OUTPUT:>
Enter the range 
5
-------------Pattern------------- 
5
5 4
5 4 3
5 4 3 2
5 4 3 2 1
*/

import java.util.Scanner;

public class prg102_printN_Rpattern {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Enter the range ");
            int n = sc.nextInt();
            System.out.println("-------------Pattern------------- ");
            for (int i = n; i>=1; i--) {
                for (int j = n; j >= i; j--) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }
}
