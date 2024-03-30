/*22.	Write a program to print the area of triangle if three sides are given? 
 * OUTPUT:>
 * Enter the length of 3 side of Triangle: 
4
8
7
Area of Triangle :19.0
*/


import java.util.Scanner;

public class prg22_areaT_3side {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println(" Enter the length of 3 side of Triangle: ");
            double a=sc.nextDouble();
            double b=sc.nextDouble();
            double c=sc.nextDouble();

             double area=a + b+c;
             System.out.println("Area of Triangle :" +area);
        }
    }
}
