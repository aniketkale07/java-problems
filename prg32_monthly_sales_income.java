/*32.	Write a program to calculate the monthly income of a person using the following 
commission schedule:(use ‘if-else-if’ statement). Monthly sales income.
>=Rs. 50,000Rs. 375+16% Sales.
>=Rs. 50,000 but>=Rs. 40,000 Rs. 370+14% Sales
>=Rs. 40,000 but>=Rs. 30,000 Rs. 325+12% Sales
>=Rs. 30,000 but>=Rs. 20,000 Rs. 300+9% Sales
>=Rs. 20,000 but>=Rs. 10,000 Rs. 250+5% Sales
>=Rs. 10,000/- Rs. 200+3% Sales

OUTPUT:>
Enter Monthly Income:
500
Monthly Sales :866
 */


import java.util.Scanner;

public class prg32_monthly_sales_income {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter Monthly Income: ");
            int income=sc.nextInt();
            //Rs. 50,000Rs. 375+16% Sales.
            if(income>50000){
            income+=(income/16)+375;
            }else if(income<50000 && income>=40000){ //>=Rs. 50,000 but>=Rs. 40,000 Rs. 370+14% Sales
                income +=(income/14)+370; 
            }else if(income<40000 &&income>=30000){        //>=Rs. 40,000 but>=Rs. 30,000 Rs. 325+12% Sales
                income +=(income/12)+325; 
            }   else if(income<30000 &&income>=20000){   //>=Rs. 30,000 but>=Rs. 20,000 Rs. 300+9% Sales
                income +=(income/12)+325; 
            }else if(income<20000 &&income>=10000){     //>=Rs. 20,000 but>=Rs. 10,000 Rs. 250+5% Sales
                income +=(income/9)+250; 
            }else{
//                >=Rs. 10,000/- Rs. 200+3% Sales
income +=(income/3)+200; 

            }

            System.out.println( "Monthly Sales income is :"+ income);                

        }
    }
}
