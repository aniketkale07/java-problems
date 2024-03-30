/*
 * 5.	Write a program to find the area and perimeter of a square?
 * OUTPUT:>
 *  enter Length of square.4
 *  Area of Square: 16.0
    Perimeter of Square: 16.0
 */

import java.util.Scanner;

class square{
    public double area(int a){
double area =a*a;                       // area = side * side
return area;
    }
    public double perimeter(int a){
        double perimeter=4 * a;         //perimeter = 4 * side
        return perimeter;
    }
}

public class prg5_area_square{
    public static void main(String[] args) {
        int l;
        try(Scanner sc=new Scanner(System.in);){
            System.out.println(" enter Length of square. ");
            l =sc.nextInt();
            
            square s=new square(); // object Creation 
            double area=s.area(l);
            double perimeter=s.perimeter(l);
System.out.println(" Area of Square: "+ area);
System.out.println(" Perimeter of Square: "+ perimeter);
        }
    }
}