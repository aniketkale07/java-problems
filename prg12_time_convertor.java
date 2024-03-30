/*12.	Write a program to convert the given seconds into hours–minutes–seconds?
 * OUTPUT:>
 * 1.Second To Minute and Hours:
   2.Hours  to Minute and Second
1
Enter seconds:
4578
1 Hours 16 Min 18 Sec 

 */

import java.util.Scanner;

public class prg12_time_convertor {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("1.Second To Minute and Hours:\n2.Hours  to Minute and Second");
            int a=sc.nextInt();
            switch(a){
                case 1:{
                    System.out.println("Enter seconds:");
                    int sec=sc.nextInt();
                    int Hours=sec/3600;
                     sec=sec%3600;
                    int min=sec/60;
                    sec=sec%60;

                    System.out.println(Hours+" Hours "+min + " Min "+sec+" Sec "  );
                    break;
                }case 2:{
                    System.out.println(" Enter Hours: ");
                    int Hours=sc.nextInt();
                    int min=Hours * 60;
                    int sec=Hours* 3600;
                    System.out.println( min +" Min"+ "\n"+sec +" Sec");
                    break;
                }default:{
                    System.out.println(" Incorrect.");
                }
            }while(a<3);
        }
    }
}
