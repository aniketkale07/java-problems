 /*44.	Write a program to find whether the given numbers existing in an array or not?
 * OUTPUT:>
 * Enter the length of an array: 
4
Enter the element of an array:
4
8
7
5
Enter the element to search in an array:
5
Element found at position : 3
 * 
 */

import java.util.Scanner;

public class prg44_check_number_array {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter the length of an array: ");
            int n=sc.nextInt();
            int [] number=new int[n];
            System.out.println("Enter the element of an array: ");
            for(int i=0;i<n;i++){
                number[i]=sc.nextInt();
            }
            System.out.println("Enter the element to search in an array: ");
            int num=sc.nextInt();
            
            for(int i=0;i<n;i++){
            if(number[i]==num){
                System.out.println("Element found at position : " + i); break;
            
            }
             }
            
        }
    }
}
