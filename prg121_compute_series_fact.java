/*121.	Write a program to compute the series.
OUTPUT:>
Enter the Range: 
5
---------Series--------
1/1 + 4/2 + 27/3 + 256/4 +
*/
import java.util.Scanner;

public class prg121_compute_series_fact {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter the Range: ");
            int n=sc.nextInt();
            int b,a=1;
            System.out.println("---------Series--------\n");
            for(int i=1;i<n;i++){
                b=1;
                for(int j=i;j>=1;j--){
                    b*=i;
                }
                System.out.print(b+"/"+i +" + ");
            }
        }
    }
}
