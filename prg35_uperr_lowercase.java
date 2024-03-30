/*
35.	Write a program to read the characters and find out whether it is uppercase or lowercase?

OUTPUT:>
Enter the Character: 
k
Char is lowercase:*/

import java.util.Scanner;

public class prg35_uperr_lowercase {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter the Character: ");
            char c=sc.next().charAt(0);
            if(c>96 &&c<123){
                System.out.println("Char is lowercase..");
            }else if(c>64&&c<91){
                System.out.println("Char is Uppercase..");
            }else{
                System.out.println("Invalid Input..");
            }
        }
    }
}
