/*166.	Write a program to read a line of text and convert all the lowercase into uppercase?
 OUTPUT:>
Enter the LowerCase String: 
aniket kale dark bird
UpperCase: ANIKET KALE DARK BIRD 
 */

import java.util.Scanner;

public class prg166_Lower_upper_String {
    public static void main(String[] args) {
        try(Scanner obj=new Scanner(System.in);){
            System.out.println("Enter the LowerCase String: ");
            String a=obj.nextLine();
            System.out.println("UpperCase: "+a.toUpperCase());
        }
    }
}
