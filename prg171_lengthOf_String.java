/*171.	Write a program to find the length of the given string?
OUTPUT:>
 Enter String: 
Aniket Kale 007

Given String: Aniket Kale 007
Length of String: 15 
 */

import java.util.Scanner;

public class prg171_lengthOf_String {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter String: ");
            String s=sc.nextLine();
            System.out.println("Given String: "+s+"\nLength of String: "+ s.length());
        }
    }
}
