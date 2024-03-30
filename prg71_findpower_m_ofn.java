/*Que. Write aprogram to find m power n(m*n)
 * OUTPUT:>
 
Enter the number
5
5 Power of Number 5  is 3125.0
 */

import java.util.Scanner;

class prg71_findpower_m_ofn{
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in);){
            System.out.println("Enter the number and power");
            int m=sc.nextInt();
            int n=sc.nextInt();
            int b=1;
            for(int i=1;i<=n;i++){
                b*=m;
            }System.out.println(n+" power of "+ m +" is "+b);
        }
    }
}