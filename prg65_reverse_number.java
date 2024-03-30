/*QUE.65. Write a program to print the reverse ofa given number..
 * OUTPUT:>
Enter the Number: 
458
Given Number: 458
Reverse Number: 854
 */


import java.util.Scanner;

public class prg65_reverse_number {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter the Number: ");
            int n=sc.nextInt();
            int num=n,a,b=0;
            while(n>0){
                a=n%10;
                n=n/10;
                b=(b*10)+a;
            }System.out.println("Given Number: "+ num+"\nReverse Number: "+ b);
        }
    }
}
