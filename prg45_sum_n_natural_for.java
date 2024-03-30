/*45.	Write a program to find the sum of ‘n’ natural numbers? 
 * OUTPUT:>
 *  Enter th valuee of n 
45
Sum of 45 Natural Number: 1035
*/

import java.util.Scanner;

public class prg45_sum_n_natural_for {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println(" Enter the valuee of n ");
            int sum=0;
            int n=sc.nextInt();
            for(int i=1;i<=n;i++){
sum=sum+i;
            }
            System.out.println("Sum of "+ n+ " Natural Number: "+sum) ;
        }
    }
}
