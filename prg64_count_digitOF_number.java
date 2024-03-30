/*Que.64. Write a program to find the numbers of digit of a given number.. 
 * OUTPUT:>
 * 
Enter the 6 digit number: 
458756
 Given Number: 458756
Sum of Even number: 18
Multiplication of Odd Number: 175
*/

import java.util.Scanner;

public class prg64_count_digitOF_number {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter the Number: ");
            int n=sc.nextInt();
            int a,b=0,c=n;
            while(n>0){
                a=n%10;
                n=n/10;
                b++;
            }
            System.out.println("Given Number: "+ c+"\nNumber of Digit: "+ b);
        }
    }
}
