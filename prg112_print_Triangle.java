/*112.	Write a program to print the following triangle?
OUTPUT:>
Enter the Range: 
5
-------------Pattern------------
5 5 5 5 5
4 4 4 4
3 3 3
2 2 
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5 
 */

import java.util.Scanner;

public class prg112_print_Triangle{
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter the Range: ");
            int n=sc.nextInt();
          System.out.println("-------------Pattern------------");
            for(int i=n;i>=1;i--){
                for(int j=i;j>=1;j--){
                    System.out.print(i +" ");
                }System.out.println();
            }

            for(int i=2;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j+" ");
                }System.out.println();
            }
        }
    }
}