/*Que. Write a program to find the sum and product of of individual of a given number..
 * OUTPUT:>
 * 
 Enter number: 
458
Given Number: 458
Sum of Digit of Given number: 17
 Multiplication of digit of given number: 160
 */

import java.util.Scanner;

public class prg62_sum_product_digit_ofGivnenN {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println(" Enter number: ");
            int n=sc.nextInt();
            int multi=1,sum=0,a=n,b;
            while(n>0){
                b=n%10;
                n=n/10;
                multi*=b;
                sum+=b;
            }System.out.println("Given Number: "+a+"\nSum of Digit of Given number: "+sum+"\nMultiplication of digit of given number: "+ multi);
        }
    }
}
