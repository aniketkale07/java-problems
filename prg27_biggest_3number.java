/*27.	Write a program to find biggest of given three numbers?
OUTPUT:>
Enter three Number: 
8
1
78
78 Is Max..
 * 
 */

import java.util.Scanner;

public class prg27_biggest_3number {
    public static void main(String[] args) {
   try(Scanner sc=new Scanner(System.in);){
    System.out.println("Enter three Number: ");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();

    if(Math.max(a, b)>c){
        System.out.println( Math.max(a, b)+ " Is Max.");
    }else if(a==b &&a>c){
System.out.println( a +" and "+b +" are max and equal..");

    }else if(a==c && a>b){
        System.out.println(a +" and "+ b +" Is max and equal..");
    }else if(b==c && b>a){
        System.out.println( b + " and "+ c+" are max and equal..");
    }else if(a==b&&b==c){
System.out.println( a + ", "+b + " and "+ c+ " are equal..");
    }
    else{
        System.out.println( c + " Is Max..");
    }
   }     
    }
}
