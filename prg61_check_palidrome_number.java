import java.util.Scanner;

/*Check the given number is Palidrome or Not.. 
 * OUTPUT:>
 *
Enter the Number: 
565
565 is palidrome Number.... 
*/
public class prg61_check_palidrome_number {
    public static void main(String[] args) {
   try(Scanner sc=new Scanner(System.in);){
    System.out.println("Enter the Number: ");
    int b=0,c;
    int n=sc.nextInt();
    int a=n;
    while(n>0){
        c=n%10;
        n=n/10;
        b=(b*10)+c;
    }if(b==a){
        System.out.println( b+" is palidrome Number....");
    }else{
        System.out.println(b+" Is not a palidrome Number..");
    }
   }     
    }
}
