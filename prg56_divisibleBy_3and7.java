/*Print number from 1 to 100 which is divisible by 3 and 7 
 * OUTPUT:>
 * Series of number which is divisible by 3 and 7
21, 42, 63, 84, 

*/


public class prg56_divisibleBy_3and7 {
    public static void main(String[] args) {
        System.out.println("Series of number which is divisible by 3 and 7");
        for(int i=1;i<=100;i++){
            if(i%3==0&&i%7==0){
                System.out.print(i +", ");
            }
        }
    }
}
