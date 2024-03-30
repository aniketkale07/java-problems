/*176.	Write a program to read book details and pass it as an argument to a function and print them? 
 * OUTPUT:>
Enter Book Id, name, author and price of book:
878
java
s.v.j
454.2
book Details: 
Book ID: 878
Book Name: java
author: s.v.j
Book Price: 454.2
*/

import java.util.Scanner;

class book {

}

public class prg176_bookDetails_Method {
        
    static int id;
    static String name,author;
   static  double price;
         static void input(){
        try(Scanner sc=new Scanner(System.in);){
                System.out.println("Enter Book Id, name, author and price of book: ");
                 id=sc.nextInt();
               String  a=sc.nextLine();
                 name=sc.nextLine();
                 author=sc.nextLine();
                 price=sc.nextDouble();
            } }
             static void display(){
                System.out.println("\nBook Details: ");
        System.out.println("Book ID: "+id+"\nBook Name: "+ name+"\nauthor: "+author + "\nBook Price: "+ price);
            } 
            public static void main(String[] args) {
                input();
                display();
            }
}
