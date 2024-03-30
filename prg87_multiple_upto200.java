/* Write a program to print the multiples of a givne number up to 200 
 * OUTPUT:>
 * 
*/

import java.util.Scanner;

public class prg87_multiple_upto200 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter the value of an n:");
   int n=sc.nextInt();
            for(int i=1;i<201;i++){
                System.out.print(200*i+" ");
            }
        }
    }
}
