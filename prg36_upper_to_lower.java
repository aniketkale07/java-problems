/*
36.	Write a program to print the uppercase letter of a given lowercase?
OUTPUT:>
enter the character: 
H
 Uppercase: H
 Lowercase: h
*/

import java.util.Scanner;

public class prg36_upper_to_lower {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
System.out.println("enter the character: ");
char c=sc.next().charAt(0);
if(c>64 &&c<91){
    System.out.println(" Uppercase: "+c+"\n Lowercase: "+Character.toLowerCase(c));
}else{
    System.out.println("Invalid Input...");
}
        }
    }
}
