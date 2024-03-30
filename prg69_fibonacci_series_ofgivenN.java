/*Que.69:> write a program to print fionacci series for a given Number:
 * OUTPUT:>
 * 
Enter the Number:
10
0 1 2 3 5 8 13 21 34 55 89 144 233
 * 
 */


import java.util.Scanner;

public class prg69_fibonacci_series_ofgivenN {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
System.out.println("Enter the Number: ");
int n=sc.nextInt();
int f0=0,f1=1,f2=2,f3;
System.out.println("-----------Series----------");
System.out.print(f0+" "+f1+" "+f2+" ");
            for(int i=1;i<=n;i++){
                f3=f1+f2;
                System.out.print(f3+" ");
                f1=f2;
                f2=f3;
               
            }

        }
    }
}
