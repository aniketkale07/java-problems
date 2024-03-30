/*33.	Write a program to read a 3 digit number and find whether the middle digit is numerically 
 to the sum of the other Two digits and prints an appropriate response?
 * OUTPUT:>
 * 
Enter Number:
154 2nd digit is equal to sum of 1st and 3rdPS 
 */

import java.util.Scanner;

public class prg33_rnumber_psum {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter Number: ");
            int a,fn,tn,b;
            a=sc.nextInt();
            b=a;
                fn=a%10;
                a=a/10;
            int sn=a%10;
             tn=a/10;
            if((fn+tn)==sn){
                System.out.println(" Condition is satisfied.. 2nd digit is equal to sum of 1st and 3rd");
            }else {
                System.out.println(" 2nd digit is not equal to sum of 1st and 3rd");
            }
        }
    }
}
