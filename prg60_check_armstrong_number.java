/*Check whether the given number is armstrong or Not..
 * OUTPUT:>
 *
Enter the number: 
153
153 is Armstrong Number.. 
 */

import java.util.Scanner;

public class prg60_check_armstrong_number {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter the number: ");
            int n=sc.nextInt();
            int a,c=0,b=n;
            while(n>0){
                a=n%10;
                n=n/10;
                c=(a*a*a)+c;
            }if(c==b){
                System.out.println(b+" is Armstrong Number..");
            }else{
                System.out.println(b+" is a Not a Armstrong Number..");
            }
        }
    }
}
