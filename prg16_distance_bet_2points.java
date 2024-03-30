/*16.	Given the coordinates of two points (x1,y1) and (x2,y2). 
Write a program to find the distance between these two points? 

OUTPUT:>
Enter the co-ordinate of point A: 
4
5
Enter the Co-Ordination of POint B:
10
8
Distanc between given Points : 6.708203932499369 unit
*/

import java.util.Scanner;

public class prg16_distance_bet_2points {
    public static void main(String[] args) {
try(Scanner sc=new Scanner(System.in);){
System.out.println("Enter the co-ordinate of point A: ");
double x=sc.nextDouble();
double y=sc.nextDouble();
System.out.println("Enter the Co-Ordination of POint B:");
double x1=sc.nextDouble();
double y1=sc.nextDouble();
//d=sqrt.(x2-x1)^2+(y2-y1)^2
x=x1-x;
y=y1-y;
double distance = Math.sqrt((x*x)+(y*y));
System.out.println("Distanc between given Points : " +distance +" unit");
}        
    }
}
