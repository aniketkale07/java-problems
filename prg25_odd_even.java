/*25.	Write a program to find out the given number is odd or even?
 OUTPUT:>
Enter the Number: 
3
3 Is Odd Number. 
 */

import java.util.Scanner;

public class prg25_odd_even {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter the Number: ");
            int n=sc.nextInt();
            if(n==0){
                System.out.println(n + " Is Zero..");
            }else if(n/2==0){
                System.out.println(n + " Is Even Number.");
            }else{
                System.out.println(n+" Is Odd Number.");
            }
        }
    }
}
