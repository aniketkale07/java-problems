/*93.	Write a program to print the following triangle?
OUTPUT:>
Enter the Range: 
5
1 1 1 1 1
2 2 2 2
3 3 3
4 4
5  
 */

import java.util.Scanner;

public class prg93_print_pattern_i {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter the Range: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(i+" ");
            }System.out.println();
        }
        }
    }
}
