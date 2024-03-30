/* Find the Power of N Number...
 * OUTPUT:>
Enter the number
5
5 Power of Number 5  is 3125.0
 */


import java.util.Scanner;

public class prg70_find_powerofN {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter the number");
            int a=sc.nextInt();
System.out.println(a+" Power of Number "+a +"  is "+Math.pow(a, a));
        }
    }
}
