/*
 * 4.	Write a program to find the square root of a given number (use sqrt () function)?

 OUTPUT:>
Enter number: 
48
Square of 48 is 6.928203230275509
 */

import java.util.Scanner;

public class prg4_sqrt_function {
    public static void main(String[] args) {
        int a;
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter number: ");
            a=sc.nextInt();
            System.out.println("Square of "+a+" is "+Math.sqrt(a));
        }
    }
}
