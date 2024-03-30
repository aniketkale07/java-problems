/*
 * 9.	Write a program to find the your age in days?
 * OUTPUT:>
 * Enter our birth date:first day,month and Year: 
08
01
2001
 Enter our Todays date:first day,month and Year:
21
2001
 Enter our Todays date:first day,month and Year:
21
10
2022
 Age in days : 7957 
 */

import java.util.Scanner;

public class prg9_ageindays {
    public static void main(String[] args) {
   try(Scanner sc=new Scanner(System.in);){

    System.out.println(" Enter our birth date:first day,month and Year: ");
    int b_day=sc.nextInt();
    int b_month=sc.nextInt();
    int  b_year=sc.nextInt();

    System.out.println(" Enter our Todays date:first day,month and Year: ");
    int todays_day =sc.nextInt();
    int todays_month=sc.nextInt();
    int todays_year=sc.nextInt();

int leap=0;
int a=0;
    for(int i=b_year;i<todays_year;i+=1000){
if(i%4==0){
leap+=364;
a++;
}
    }
    int year=(todays_year - b_year)-a; year *=365; year +=leap;
    int month= todays_month - b_month; month *=31;
    int days=todays_day-b_day; 
    System.out.println("Age : "+ (todays_year - b_year) +" Years.\n" +" Age in Days: "+ year + month +days+" Days.");
   }     
    }
}
