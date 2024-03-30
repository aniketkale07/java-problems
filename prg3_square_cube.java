import java.util.Scanner;

/*
 3.	Write a program to find the square and cube of a given number?
 
 OUTPUT:>
Enter the number: 
12
Square of 12 is 144
Cube of 12 is 1728
 */

 class number{
    void cube(int a){
        System.out.println("Cube of "+ a+ " is "+ a*a*a);
    }
    void square(int a){
        System.out.println("Square of "+ a+" is "+ a*a);
    }
 }
public class prg3_square_cube {
    public static void main(String[] args) {
 int a;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number: ");
 a=sc.nextInt();       

 number n=new number();
 n.square(a);
 n.cube(a);
    }
}
