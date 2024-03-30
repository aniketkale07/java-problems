/*14.The temperature of the city is input 
 through the keyboard in Fahrenheit. Write a program to convert into Celsius? 
 
 OUTPUT:>
 Enter Temperature: 
56
Temperature in Celsius: 13.333333333333334 C
 */

import java.util.Scanner;

public class prg14_temperature{
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
System.out.println(" Enter Temperature in fahrenheit: ");
double Fahrenheit=sc.nextDouble();
 double Celsius=(Fahrenheit -32)* 5/9;
 System.out.println("Temperature in Celsius: "+ Celsius + " C");
        }
    }
}