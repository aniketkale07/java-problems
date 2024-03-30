/*120.	Write a program to compute the series.
OUTPUT:>
Enter the Range: 
5
-----------Series-----------
1 + 2 + 6 + 24 + 120 +
 */

import java.util.Scanner;

public class prg120_compute_series_fact {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Enter the Range: ");
            int b = 1;
            int n = sc.nextInt();
            System.out.println("-----------Series-----------");
            for (int i = 1; i <= n; i++) {
                b=1;
            for(int j=i;j>=1;j--){
                b=b*j;
            }System.out.print(b+" + ");    
            }
            }
        }
    }

