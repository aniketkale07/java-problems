/*1.	Write a program to print the given number in words?
 OUTPUT:>
Enter Range:45

--------Series------------
1 + 3 + 5 + 7 + 9 + 11 + 13 + 15 + 17 + 19 
+ 21 + 23 + 25 + 27 + 29 + 31 + 33 + 35 + 37 + 39 + 41 + 43 + 45
 */


import java.util.Scanner;

public class prg116_compute_seriesN {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter Range:");
            int n=sc.nextInt();
            System.out.println("--------Series------------\n");
            for(int i=1;i<=n;i+=2){
                System.out.print(i+" + ");
            }
 
        }
    }
}
