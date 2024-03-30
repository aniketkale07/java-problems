/*Que.check number is prime or not..
 * OUTPUT:>
Enter the Number: 
5
5 is Prime..
PS C:\Users\Angel\Documents\GitHub> 
 */

import java.util.Scanner;

public class prg57_check_prime_or_not {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter the Number: ");
            int n=sc.nextInt();
            int div=0;
            for(int i=2;i<n;i++){
                if(n%i==0){
                div++;
                }
            }if(div==0){
                System.out.println(n+" is Prime..");
            }else{
                System.out.println(n+" is Not Prime..");
            }
        }
    }
}
