/*103.	Write a program to print the following triangle?
OUTPUT:>

Enter Range:
5
--------Pattern--------
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1
 */

import java.util.Scanner;

public class prg103_print_pattern {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter Range:");
            int n=sc.nextInt();
            System.out.println("--------Pattern--------");
            for(int i=1;i<=n;i++){
                for(int j=i;j>=1;j--){
                    System.out.print(j +" ");
                }System.out.println();
            }
        }
    }
}
