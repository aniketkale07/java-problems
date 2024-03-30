/*check the given number is Perfect or Not.. 
 * OUTPUT:>
 * 
Enter the Number: 
16
16 is Perfect Number..
*/
import java.util.Scanner;

public class prg58_check_perfect_number {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter the Number: ");
            int n=sc.nextInt();
            double a;
            a=Math.sqrt(n);
            if(a*a==n){
                System.out.println(n + " is Perfect Number..");
            }else{
                System.out.println(n+ " is Not Perfect Number..");
            }
        }
    }
}
