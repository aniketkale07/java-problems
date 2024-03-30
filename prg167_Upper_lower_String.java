/*167.	Write a program to read a line of text and convert all the uppercase into lowercase?
 * OUTPUT:>
Enter the Uppercase String: 
ANIKET KALE
LowerCase: aniket kale
 */

import java.util.Scanner;

public class prg167_Upper_lower_String {
    
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
System.out.println("Enter the Uppercase String: ");
String b=sc.nextLine();
System.out.println("LowerCase: "+b.toLowerCase());        }
    }
}
