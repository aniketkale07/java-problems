

import java.util.Scanner;

public class prg113_print_pattern {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter the Range: ");
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                for(int j=i;j>=1;j--){
                    System.out.print(j+" ");
                }System.out.println();
            }
        }
    }
}
