/*
34.	A company insures its drivers in the following cases
1.	If the driver is married
2.	If the driver is unmarried, male and above 30 years of age
3.	If the driver is unmarried, female and above 25 years of age
In all other cases, the driver is not insured. If the marital status, sex, age of the driver are the inputs,
write a program to determine whether the driver is insured or not. (use ‘nested-if’).
OUTPUT:>

Enter age,Gender and marital status of driver: 
26
Choose Gender:
1.Male
2.Female
2
Martial Status:
1.Married
2.Unmarried
2
The driver is insured.. 
*/

import java.util.Scanner;

public class prg34_company_insure {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter age,Gender and marital status of driver: ");
            int age=sc.nextInt();
            System.out.println("Choose Gender:\n1.Male\n2.Female");
            int gender=sc.nextInt();
            System.out.println("Martial Status: \n1.Married\n2.Unmarried"); // 
            int status=sc.nextInt();
            if(status ==2){
                if((gender==1&&age>30 )||(gender==2&&age>=25)){
System.out.println("The driver is insured..");
                }else {
                    System.out.println("The driver is not insured..");
                }
            }else{
                System.out.println("The driver is not insured..");
            }
        }
    }
}
