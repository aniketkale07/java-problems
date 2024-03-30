/*v90.	Write a program to print the following triangle?
enter the number of Rows:
5
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 */

import java.util.Scanner;

public class prg90_print_triangle {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
System.out.println("enter the number of Rows:");
int n=sc.nextInt();
for(int i=0;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print(j +" ");
    }System.out.println();
}
        }
    }
}
