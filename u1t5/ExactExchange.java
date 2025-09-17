package u1t5;

import java.util.Scanner;

public class ExactExchange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your money in cents: ");
        double money = scanner.nextDouble();
        scanner.nextLine();
        double newMoney = money % .25;
        int quarters = (int)((money-newMoney)/.25);
        money = newMoney;
        newMoney = money % .1;
        int dimes = (int)((money-newMoney)/.1);
        money = newMoney;
        newMoney = money % .05;
        int nickels = (int)((money-newMoney)/.05);
        money = newMoney;
        newMoney = money % .01;
        int pennies = (int)((money-newMoney)/.01);
        money = newMoney;
        System.out.println("minimum number of coins is " + (quarters+dimes+nickels+pennies));
        System.out.println("quarters: " + quarters);
        System.out.println("dimes: " + dimes);
        System.out.println("nickles: " + nickels);
        System.out.println("pennies: " + pennies);
    }
}