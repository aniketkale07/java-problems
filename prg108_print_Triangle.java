/*write a program to print the Following triangle...
 * OUTPUT:>
 
Enter the no. of Range: 
5
----------------Pattern------------
5 5 5 5 5
 4 4 4 4
  3 3 3
   2 2
    1 
 */

import java.util.Scanner;

public class prg108_print_Triangle {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter the no. of Range: ");
            int n=sc.nextInt();
            System.out.println("----------------Pattern------------");
            for(int i=n;i>=1;i--){
                for(int j=n-i;j>=1;j--){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print(i +" ");
                }System.out.println();
            }
        }
    }
}
