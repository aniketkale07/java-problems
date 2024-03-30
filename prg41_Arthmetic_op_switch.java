/*41.	Write a program to emulated a four function calculator which can perform addition, 
subtraction multiplication and Division. Program should read 
two real numbers and an operator which tells the operation to the performed. Do it by using Case? 
OUTPUT:>
choose Operation:
 + , - , * , / , %
-
Substrattion of 45 and 55 = -10
*/

import java.util.Scanner;

public class prg41_Arthmetic_op_switch {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter two Numbers:");
       int a=sc.nextInt();
       int b=sc.nextInt();
       System.out.println("choose Operation:\n + , - , * , / , % ");
       char c=sc.next().charAt(0);
       switch(c){
        case '+':{
            System.out.println("Addition of "+a+" and "+ b + " = "+ (a+b));break; 
        }case '-':{
            System.out.println("Substrattion of "+a +" and "+ b +" = "+(a-b));break;
        }case '*':{
            System.out.println("Multiplication of "+ a + " and "+ b + " = "+(a*b));break;
        }case '/':{
            System.out.println("Division of "+a +" and "+ b + " = "+ (a/b));break;
        }case '%':{
            System.out.println("Reminder of "+a +" and "+b + " = "+(a%b));break;
        }default:{
            System.out.println(" Invalid Input: ");
        }

       }
        }
    }
}
