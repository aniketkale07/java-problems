/*92.	Write a program to print the following triangle?
Enter number of rows: 
5
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */

import java.util.Scanner;

public class prg92_print_Rpattern {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter number of rows: ");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){ //col
            for(int j=1;j<=i;j++){ //row
                System.out.print(j +" ");
            }System.out.println();
        }
        }
    }
}
