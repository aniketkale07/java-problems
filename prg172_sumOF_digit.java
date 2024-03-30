/*172.	Write a program to print the sum of digits of a given number? 
 * OUTPUT:>
 * 
Enter Number: 
548
Sum of digit of 548 number: 17
*/

import java.util.Scanner;

public class prg172_sumOF_digit {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
System.out.println("Enter Number: ");
int n=sc.nextInt();
int a=0,b, v=n;
while(n>0){
    b=n%10;
n=n/10;
a=a+b;
}
System.out.println("Sum of digit "+ v+" number: "+ a);
        }
    }
}
