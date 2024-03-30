/*26.	Write a program to find smallest of given two numbers? 
 * OUTPUT:>
 * Enter two number: 
45
12
Smallest Number: 12
*/

import java.util.Scanner;

public class prg26_smalllest_number {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
System.out.println("Enter two number: ");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("Smallest Number: "+Math.min(a, b));
        }
    }
}
