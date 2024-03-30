/*QUE. Write a program to print the factorial prime number from 1 to 99
OUTPUT:>
 * 1 1, 2 2, 3 6, 5 120, 7 5040, 11 39916800, 13 1932053504, 17 -288522240, 19 109641728, 23 862453760, 29 -1241513984, 31 738197504, 
 * 37 0, 41 0, 43 0, 47 0, 53 0, 59 0, 61 0, 67 0, 71 0, 73 0, 79 0, 83 0, 89 0, 97 0,
 */

public class prg68_Fact_prime_1To99 {
    public static void main(String[] args) {
        long c,a=1,b;
        for(long i=1;i<100;i++){
            c=0;
            for(long j=2;j<i;j++){
                if(i%j==0){
                    c++;
                }
            }if(c==0){
                b=1;
                for(long k=1;k<=i;k++){
                    b*=k;
                }
                System.out.print(i+" "+ b+", ");
                }
        }
    }
}
