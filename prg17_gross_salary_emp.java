/*17.	Rajesh’s basic salary is input through the keyboard. His D.A. is 40% of basic salary, and
H.R.A. is 20% of basic salary. Write a program to calculate his gross salary?

D.A= Dearness Allowness
HRA=home rent allowence
OUTPUT:>
Enter the basic salary: 
400
Gross Salary: 801.2
*/

import java.util.Scanner;

public class prg17_gross_salary_emp {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter the basic salary: ");
            int  salary = sc.nextInt();

            double DA= (salary * 12)/100;
            double HRA=salary+DA/40;
            
        double gross_salary = salary + HRA;
        System.out.println( "Gross Salary: "+ gross_salary);
        }
    }
}
