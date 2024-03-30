/*18.	The distance between two cities in Km. is input through the keyboard.
 Write a program to convert and print the result in meters and centimeters? 
 
 OUTPUT:>
 Enter Distance in KM: 
10
Distance in Meter: 10000 m
Distance in Centimeters :10000000 cm
PS C:\Users\Admin\Documents\GitHub> 
 */

import java.util.Scanner;

public class prg18_km_to_cm {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter Distance in KM: ");
            int KM=sc.nextInt();
            long meters=KM * 1000;
            long centimeters=(KM * 1000000);
            System.out.println( "Distance in Meter: "+ meters +" m\nDistance in Centimeters :"+centimeters+" cm");
        }
    }
}
