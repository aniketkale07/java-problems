/*28.	Write a program to check whether the given year is leap year or not?

OUTPUT:>
enter Year: 
2004
2004 is Leap Year..
PS C:\Use* 
 */

import java.util.Scanner;

public class prg28_leapYear {
    public static void main(String[] args) {
            try(Scanner sc=new Scanner(System.in);){
System.out.println("enter Year: ");
int year =sc.nextInt();
if(year%4==0){
    System.out.println(year + " is Leap Year..");
}else{
    System.out.println(year + " is not leap year..");
}
        }
    }
}
