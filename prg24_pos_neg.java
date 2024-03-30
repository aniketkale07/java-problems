/*24.	Write a program to check whether the given number is positive or negative?
 * OUTPUT:>
 * Enter the number:
4
4 Is Positive Number:
 */

import java.util.Scanner;

public class prg24_pos_neg {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter the number: ");
            int n=sc.nextInt();
            if(n==0){
                System.out.println(n +" Is Zero.");
            }else if(n>0){
                System.out.println( n +" Is Positive Number: ");
            }else if(n<0){
                System.out.println(n +" Is negative Number...");
            }else{
                System.out.println( n+" Is Invalid Number.. ");
            }
        }
    }
}
