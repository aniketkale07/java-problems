/*Que. 85- Aceept number form user and chagne into roman..
 * OUTPUT:>
 
Enter the number: 
254
Number in Roman: IVVII
 */

import java.util.Scanner;

public class prg85_NumberTo_Roman {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter the number: ");
            int n=sc.nextInt();
            int b=n;
            int a;
            System.out.print("Number in Roman: ");
            while(n>0){
                a=n%10;
                n=n/10;
                switch(a){
                    case 1:System.out.print("I ");break;
                    case 2:System.out.print("II ");break;
                    case 3:System.out.print("III ");break;
                    case 4:System.out.print("IV ");break;
                    case 5:System.out.print("V ");break;
                    case 6:System.out.print("VI ");break;
                    case 7:System.out.print("VII ");break;
                    case 8:System.out.print("VIII ");break;
                    case 9:System.out.print("IX ");break;
                    case 10:System.out.print("X ");break;
                }
            }
        }
    }
}
