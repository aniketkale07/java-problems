/*Print Right angle Triangle Pattern 
 * OUTPUT:>
 Enter the Range: 
5
--------Pattern---------
1 2 3 4
  1 2 3
    1 2
      1
 */

import java.util.Scanner;

public class prg99_rightTriangle {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter the Range: ");
            int n=sc.nextInt();
            System.out.println("--------Pattern---------");
            for(int i=n;i>=1;i--){
                for(int j=2*(n-i);j>=1;j--){
                    System.out.print(" ");
                }for(int k=1;k<i;k++){
                    System.out.print(k+" ");
                }System.out.println();
            }
        }
    }
}
