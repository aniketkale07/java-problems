/*193.	Write a program to print the given number in words?
OUTPUT:>
 Enter the number: 
5869
Number in word:
Five Eight Six Nine */

import java.util.Scanner;

public class prg193_number_into_word {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println(" Enter the number: ");
            int n = sc.nextInt();
            int a=0, b=n, c,sum=0;
while(n>0){
    a=n%10;
    n=n/10;
    sum=(sum*10)+a;
}
System.out.println("Number in word: ");
            while (sum > 0) {
                c = sum % 10;
                sum= sum / 10;
                switch (c) {
                    case 0: {
                        System.out.print("Zero "); break;
                    }
                    case 1: {
                        System.out.print("One "); break;
                    }
                    case 2: {
                        System.out.print("Two "); break;
                    }case 3:System.out.print("Three ");break;
                    case 4:System.out.print("Four "); break;
                    case 5:System.out.print("Five ");break;
                    case 6:System.out.print("Six ");break;
                    case 7:System.out.print("Seven ");break;
                    case 8:System.out.print("Eight ");break;
                    case 9:System.out.print("Nine ");break;
                }
            }
        }
    }
}
