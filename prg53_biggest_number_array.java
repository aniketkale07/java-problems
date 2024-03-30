/*Que. Find biggest number in an array.. 
 * OUTPUT:>
 *  
enter the element of an array: 
5
Enter 5 numbers:
54 85 45 25 99
 Biggest number in given number99
*/

import java.util.Scanner;

public class prg53_biggest_number_array {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("enter the element of an array: ");
            int n=sc.nextInt();
            int[] number=new int[n]; 
            
            int temp;
            System.out.println("Enter "+ n+" numbers: ");
            
            for(int i=0;i<n;i++){
                number[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
if(number[i]>number[j]){
    temp=number[i];
    number[i]=number[j];
    number[j]=temp;
}
                }
            }
        System.out.println(" Biggest number in given number list "+number[n-1]);
        }
    }
}
