/*
122.Write a program to compute the cosine series.
OUTPUT:>
Enter the value of n: 
5
----------Series----------
1/1 + 4/4 + 9/27 + 16/256 + 25/3125 +
 */

import java.util.Scanner;

public class Prg122_compute_series {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter the value of n: ");
            int n=sc.nextInt();
            int b=1,a=1;
            System.out.println("----------Series----------\n");
            for(int i=1;i<=n;i++){
                a=1;
                for(int j=i;j>0;j--){
                    
                    a*=i;   //fact
                }
                System.out.print((i*i)+"/"+a+" + ");
            }

        }
    }
}
