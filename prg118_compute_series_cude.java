/*118.	Write a program to compute the series.
1 + 8 + 27 + 64 +	+ n
 * OUTPUT:>
 * Enter the Range: 
5
-------Series--------
0 + 1 + 8 + 27 + 64 +
 */


import java.util.Scanner;

public class prg118_compute_series_cude {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter the Range: ");
            int n=sc.nextInt();
            System.out.println("-------Series--------");
        for(int i=1;i<n;i++){
            int b=0;
             b=i*i*i;
            System.out.print(b+" + ");
        }
        }
    }
}
