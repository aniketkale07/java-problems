/*
 * 1.	Write a program to add and subtract two numbers?
 * 
 * OUTPUT:>
     Enter two Number: 
85
12
Addition of two number: 97
Substraction of two number: 73

 */

import java.util.Scanner;


class cal{
    int a,b;
    public void add(int a,int b){
int c=a+b;
System.out.println("Addition of two number: "+ c);
    }
    public void sub(int a,int b){
        int c=a-b;
        System.out.println("Substraction of two number: "+ c);
    }
}
public class prg_1_add_sub {
    public static void main(String[] args) {
   try(Scanner sc=new Scanner(System.in);){
    System.out.println(" Enter two Number: ");
int a=sc.nextInt();
int b=sc.nextInt();

cal c=new cal();

c.add(a, b);
c.sub(a, b);
}     
    }
}
