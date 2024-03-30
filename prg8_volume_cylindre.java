/*8.Write a program to find the volume of a cylinder?
 * OUTPUT:>
 Enter the radius and height of Cylinder: 
4.2
5.2
 Volume of Cylinder : 288.02592000000004
 */

import java.util.Scanner;

public class prg8_volume_cylindre {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println(" Enter the radius and height of Cylinder: ");
            double r=sc.nextDouble();
            double h=sc.nextDouble();
            // v = 3.14*r*r*h
            double volume=3.14 * r*r*h;
            System.out.println(" Volume of Cylinder : "+ volume);

        }
    }
}
