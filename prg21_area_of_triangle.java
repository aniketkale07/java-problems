/*21.	Write a program to print the area of triangle if b and h values are given? 
 * OUTPUT:>
 * Enter the Base and height of Triangle:  
4
7
Area of Triangle is :14.0
*/

// package program200;

import java.util.Scanner;
class triangle{
    void area(double b,double h){
        double area = 0.5*b*h;
        System.out.println("Area of Triangle is :"+area );
    }
}
public class prg21_area_of_triangle {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter the Base and height of Triangle:  ");
            double b=sc.nextDouble();
            double h=sc.nextDouble();

            triangle t=new triangle();
            t.area(b,h);
        }
    }
}
