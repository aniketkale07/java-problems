/*Que.72: Write a program to find "n "  power 'n ' value without using (*) 
 * OUTPUT:>
 * 
Enter the value of n 
3
Power of 3: 27.0
*/

import java.util.Scanner;

public class prg72_findPower_n_without {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter the value of n ");
            int n=sc.nextInt();
            System.out.println("Power of "+n+": "+ Math.pow(n, n));
        }
    }
}
