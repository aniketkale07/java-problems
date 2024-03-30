/*
37.	Write a program to check whether the given input is digit or lowercase character or
 uppercase character or a special character (use ‘if-else-if’ ladder)?

OUTPUT:>
Enter the value: 
 
h
h is Lowecase Alphabet.. */

import java.util.Scanner;

public class prg37_check_input_lader {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter the value: ");
            char a=sc.next().charAt(0);
            if(a>96&&a<122){
                System.out.println( a + " is Lowecase Alphabet..");
            }else if(a>64&&a<91){
                System.out.println(a+" is Uppercase Alphabet..");
            }else if(a>=0 ||a<0){
                System.out.println(a +" is digit..");
            
            }else{
                System.out.println(a+ " is Specal Character..");
            }
        }
    }
}
