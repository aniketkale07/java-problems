/*
39.	Write a program to read a vowel character and print any
 appropriate word by using “Switch case”?

OUTPUT:>
enter Vowel:
o
oppournity
enter Vowel: 
s
Invalid Input.
 */


import java.util.Scanner;

public class prg39_vowel_character {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){

            System.out.println("Enter Vowel: ");
            char v=sc.next().charAt(0);
            switch(v){
                case 'A':{
                    System.out.println("Anime"); break;
                }
                case 'a':{
                    System.out.println("apple"); break;
                }
                case 'O':{
                    System.out.println("Orange"); break;
                }
                case 'o':{
                    System.out.println("oppournity"); break;
                }
                case 'E':{
                    System.out.println("Eclipse"); break;
                }
                case 'e':{
                    System.out.println("element"); break;
                }
                case 'I':{
                    System.out.println("India"); break;
                }
                case 'i':{
                    System.out.println("india"); break;
                }
                case 'U':{
                    System.out.println("Union"); break;
                }
                case 'u':{
                    System.out.println("unity"); break;
                }
                default:{
                    System.out.println("Invalid Input.."); break;
                }
            }
        }
    }
}
