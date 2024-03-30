/*
101.	Write a program to print the following triangle?
OUTPUT:>
Enter the range: 
5
5 4 3 2 1 
4 3 2 1 
3 2 1 
2 1
1
 */

import java.util.Scanner;

public class prg101_triangle_reverse_series {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter the range: ");
            int n=sc.nextInt();
            for(int i=0;i<=n;i++){ //col
                for(int j=(n-i);j>=1;j--){
                    System.out.print(j +" ");
                }System.out.println();
            }
        }
    }
}
