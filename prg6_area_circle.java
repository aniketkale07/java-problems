/*
 * 6.	Write a program to find the area and circumference of a circle?

 OUTPUT:>
Enter the radius: 
12
 Area of Circle : 904.3199999999999
 Circumference of Circle: 75.36
 */

import java.util.Scanner;

public class prg6_area_circle {
    public static void main(String[] args) {
        double r;
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter the radius: ");
            r=sc.nextDouble();
        double area=2*3.14*r*r;
    

        // Circuferebce of Circle = 2*3.14*r
            double circumference = 2*3.14*r;

            System.out.println(" Area of Circle : "+ area);
            System.out.println(" Circumference of Circle: "+ circumference);
    }
    }
}
