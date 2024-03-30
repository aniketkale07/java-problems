/*15.	Two numbers are input into two locations ‘a’ and ‘b’ Write a program to interchange the contents of ‘a’ 
and ‘b’ without using temporary variables? 
OUTPUT:>
Enter two variable: 
45
10
87
Before Swaping: a: 10b: 87
After Swaping: a: 87b: 10
*/

import java.util.Scanner;
public class prg15_swap_withoutTemp {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
System.out.println("Enter two variable: ");
int a,b;
a=sc.nextInt();
b=sc.nextInt();
System.out.println("Before Swaping: "+"a: "+a + " b: "+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("After Swaping: "+"a: "+ a+" b: "+b);
        }
    }
}
