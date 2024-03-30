/*Que.67: Print prime number from 1 to 99.
 * OUTPUT:>
Prime Number series from 1 to 100: 
1 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 
 */

public class prg67_prime_number_1To99 {
    public static void main(String[] args) {
        int a = 1,  c;
        System.out.println("Prime Number series from 1 to 100: ");
        for (int i = 1; i < 100; i++) {
            c=0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    c++;
                }
            }if(c==0){
                System.out.print(i+" ");
            } 
        }
    }
}
