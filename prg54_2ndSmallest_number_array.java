/* Print 2nd smallest number in an array..v
 * OUTPUT:>
 * 
enter arrray length: 
4
enter List of numbers:
22
11
54
45
 2nd Smallest Number in given Range: 22
 */
import java.util.Scanner;
public class prg54_2ndSmallest_number_array {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("enter arrray length: ");
            int n=sc.nextInt();
System.out.println("enter List of numbers: ");
            int[] number=new int[n];
            int temp;
            for(int i=0;i<n;i++){
                number[i]=sc.nextInt();

            }for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(number[i]>number[j]){
                        temp=number[j];
                        number[j]=number[i];
                        number[i]=temp;
                    }
                }
            }System.out.println(" 2nd Smallest Number in given Range: "+number[1]);
        }
    }
}
