/*
 * 7.	Write a program to find the area of a sphere?
 * OUTPUT:>
 Enter the radius of Sphere: 
4.1
 Area of Sphere 211.13359999999997
 * 
 */

import java.util.Scanner;

public class prg7_area_sphere {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println(" Enter the radius of Sphere: ");
            double r=sc.nextDouble();

            double area=4*3.14*r*r;
            System.out.println(" Area of Sphere "+ area);
        }
    }
}
