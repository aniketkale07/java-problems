/*100.	Write a program to print the following triangle?

5
1
1 2
1 2 3
1 2 3 4
 */

import java.util.Scanner;

public class prg100_triangle_series {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("enter the range of triangle: ");
            int n=sc.nextInt();
            for(int i=0;i<=n;i++){
                for(int j=1;j<i;j++){
                    System.out.print(j+" ");
                }System.out.println();
            }
        }
    }
}
