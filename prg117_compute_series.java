/*117.	Write a program to compute the series.
OUTPUT:>
Enter the range: 
12
--------Series----------

1 + 4 + 9 + 16 + 25 + 36 + 49 + 64 + 81 + 100 + 121 +

 */


import java.util.Scanner;

public class prg117_compute_series {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter the range: ");
            int n=sc.nextInt();
            System.out.println("--------Series----------\n");
            for(int i=1;i<n;i++){
                System.out.print(i*i+" + ");
            }
        }
    }
}
