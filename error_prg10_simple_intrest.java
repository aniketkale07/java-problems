/*10.	Write a program to find the simple interest and compound interest? */

import java.util.Scanner;

public class error_prg10_simple_intrest {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){

            System.out.println("Enter Principal Amount,Interest rate and time in Years ");
            double Principal,si,r,t,cp;
            Principal =sc.nextDouble();
            r=sc.nextDouble();
            t=sc.nextDouble();
            //simple Interest = principal * interest Rate * time 
            si= Principal * r * t;

            cp= Principal * (Principal/100) *t;
            System.out.println("Simple Interest: "+si );
            System.out.println("Compound Interest :S" +cp );
            
        }
    }
}
