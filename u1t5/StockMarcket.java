package u1t5;

import java.util.Scanner;

public class StockMarcket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your stock symbol: ");
        String stock = scanner.nextLine();
        System.out.print("How many stocks do you have? ");
        int amount = scanner.nextInt();
        System.out.print("How much did the stock change in value? ");
        double amountChanged = scanner.nextDouble();
        int moneyChanged = (int)((amount*amountChanged+(0.5*Math.signum(amountChanged))));
        System.out.println("Change in stock value is $" + moneyChanged);
    }  
}
