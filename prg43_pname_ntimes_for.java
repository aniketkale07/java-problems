/*43.	Write a program to read your name and print it ‘n’ times?
 * OUTPUT:>
 * Enter Name: and How many times to Print..
Aniket k
5
Aniket k
Aniket k
Aniket k
Aniket k
Aniket k
 */

import java.util.Scanner;

public class prg43_pname_ntimes_for {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println( "Enter Name: and How many times to Print..");
String name=sc.nextLine();
int n=sc.nextInt();
for(int i=0;i<n;i++){
    System.out.println(name+"");
}
        }
    }
}
