/*
 2.Write a program to multiply and divide two numbers and print them 
  in the form of equation (4*3=12 8/4=2)?

OUTPUT:>
Enter two numbers: 
45
5
45*5 = 225
45/5 = 9
  */

import java.util.Scanner;


class multiply{
    void multi(int a,int b){
        System.out.println(a +"*"+b +" = "+ (a*b));
    }
    void divide(int a,int b){
        System.out.println(a+"/"+b+" = "+(a/b));
    }
}

public class prg2_multiply {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter two numbers: ");
        try(Scanner sc=new Scanner(System.in);){
            a=sc.nextInt();
            b=sc.nextInt();

            multiply c=new multiply(); // object Creation 
            c.multi(a,b);
            c.divide(a,b);


        }
    }
}
