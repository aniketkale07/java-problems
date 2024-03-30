/*181.	Write a program to store your name, age
, birth date into record and print. Do this program by using functions? 
OUTPUT:>
Enter the UserName, age and BirthDate.. resp.
Aniket
32
08 Jan 2001
---------Personal details-----------
Username: Aniket
Age: 32
BirthDate: 08 Jan 2001
*/

import java.util.Scanner;

public class prg181_PersonalDetail_method {

    static void P_Details(){
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter the UserName, age and BirthDate.. resp.");
            String name=sc.nextLine();
            int age=sc.nextInt();
            String a=sc.nextLine();
            String dob=sc.nextLine();   
            display(name,age,dob);
        }}
     static void display(String username, int age, String dob) {
        System.out.println("---------Personal details-----------\nUsername: "+username+"\nAge: "+age +"\nBirthDate: "+ dob);

     
    }
    public static void main(String[] args) {
        P_Details();
    }
}
