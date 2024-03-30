/*
20.	Write a program to read your address and print it?
 * OUTPUT:>
 
Enter Address: 
sonaichiwadi, Patan,Satara
 Address : sonaichiwadi, Patan,Satara
 */

import java.util.Scanner;

public class prg20_address {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter Address: ");
            String address=sc.nextLine();
            System.out.println("Your Address is : "+address);
        }
    }
}
