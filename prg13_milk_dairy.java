/*13.A milk vendor buys milk at the rate of 3.25/- the then adds a liter of water for 
every 4 liters of milk and sells the water milk at the rate of 4.15/1t. calculate the gain
 for milk vendor? 
 
 OUTPUT:>
  how Much milk buy by vendor:
25
Buy Milk 25.0 
Price of Buy Milk: 81.
water Added: 6.25L
Total Milk: 31.25L
price of Sell Milk: 129.6875
Gain Profit: 48.4375
 */

import java.util.Scanner;

public class prg13_milk_dairy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" how Much milk buy by vendor: ");
        double n = sc.nextDouble();
        // n for no of liters buy ..
        double sell_l = n;
        // find out total amount ot buy to milk
        double total_buy_l = n * 3.25;

        double a = 0;
        a = sell_l / 4;

        sell_l += a; // additing water in milk
        // calulating total selling price of milk after
        double sell_price = sell_l * 4.15; // 4.15 fixed rate for per L
        System.out.println("Buy Milk " + n + "\nPrice of Buy Milk: " + total_buy_l + "\nwater Added: " + a
                + "L\nTotal Milk: " + sell_l + "L\nprice of Sell Milk: " + sell_price + "\nGain Profit: "
                + (sell_price - total_buy_l));
    }
}
