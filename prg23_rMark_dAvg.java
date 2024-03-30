/*23.	Write a program to read the marks of 3 subjects and display the total, avg, class?
 * OUTPUT:>
 *  Enter the marks of Subject : 
10
54
88
Marks of 3 subject: 10.0, 54.0, 88.0
Average : 50.666666666666664
 */
import java.util.Scanner;
public class prg23_rMark_dAvg {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println(" Enter the marks of Subject : ");
            double m1=sc.nextDouble();
            double m2=sc.nextDouble();
            double m3=sc.nextDouble();

            double avg=(m1+m2+m3)/3;
            System.out.println("Marks of 3 subject: " + m1 +", "+m2 +", "+m3+ "\nAverage : "+ avg);


        }
    }
}
