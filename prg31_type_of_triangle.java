/*31.	Write a program to read three sides a,b,c of a triangle and print the type of the triangle?
 Right angled triangle(a*a)+(b*b)==(c*c)||(b*b)+(c*c)==(a*a)|| (c*c)+(a*a)==(b*b) 
 Equilateral triangle(a==b) && (b==c)
Isosceles triangle(a==b) || (b==c) || (c==a) Scalene(a!=b&&b1=c && c!=a)
OUTPUT:>
Enter the three side of Triangle: 
4
7
4
The given trinagle is Isosceles Triangle..
*/

import java.util.Scanner;

public class prg31_type_of_triangle {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
System.out.println("Enter the three side of Triangle: ");
int a,b,c;
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();

if((a*a)+(b*b)==(c*c)||(b*b)+(c*c)==(a*a)|| (c*c)+(a*a)==(b*b)){
    System.out.println("The given Triangle is Right angled triangle. ");
}else if((a==b) && (b==c)){
    System.out.println(" The give triangle is Equilateral Triangle..");
}else if((a==b) || (b==c) || (c==a)){
    System.out.println("The given trinagle is Isosceles Triangle..");
}else if((a!=b&&b!=c && c!=a)){
    System.out.println("The given triangle is Scalene triangle..");
}else{
    System.out.println(" This given sides are not a triangle..");
}
        }
    }
}
