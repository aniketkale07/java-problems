/*Que.66. Write a program to find the factorial of the given number: 
 * OUTPUT:>
 * 
Enter the Number: 
3
Given Number: 3
Factorial : 6
 */

import java.util.Scanner;

public class prg66_Factorial_ofnumber {
    public static void main(String[] args) {
        try(Scanner scc=new Scanner(System.in);){
            System.out.println("Enter the Number: ");
            int n=scc.nextInt();
            int num=n,a=1,b,c;
            for(int i=n;i>=1;i--){
                a*=i;
            }System.out.println("Given Number: "+ num+"\nFactorial : "+ a);
        }
    }
}
