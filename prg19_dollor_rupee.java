/*19.	Write a program which accepts the amount in dollars and convert into rupees?
 * 
 * OUTPUT:>
enter to value to convert in Rupee: 
21.3
21.3 dollor into rupees 1497.39
 */

import java.util.Scanner;
public class prg19_dollor_rupee {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("enter to value to convert in Rupee: ");
            double dollor=sc.nextDouble();
            double rupees= dollor * 70.3;
            System.out.println(dollor +" dollor into rupees "+rupees+" Rs ");
        }
    }
}
