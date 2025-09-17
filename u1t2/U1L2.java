package u1t2;
import java.util.Scanner;

/* Alexey Khoroshenkiy 
 * This code calculates the minimum amount of coins needed to reach a set ammount
 */

public class U1L2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much money in cents do you have?");
        float money = scanner.nextFloat();
        final boolean MIN = true;
        int quarters;
        int dimes;
        int nickles;
        int pennies;
        String finalMessage;
        if (MIN){
            //Use mod to find the money that can't be converted to a certain coin
            float newMoney = money % .25f;
            quarters = (int)((money-newMoney)/.25f);
            money = newMoney;
            newMoney = money % .1f;
            dimes = (int)((money-newMoney)/.1f);
            money = newMoney;
            newMoney = money % .05f;
            nickles = (int)((money-newMoney)/.05f);
            money = newMoney;
            newMoney = money % .01f;
            pennies = (int)((money-newMoney)/.01f);
            money = newMoney;
            finalMessage = "The minimum amount of coins is: " + (quarters+dimes+nickles+pennies);
            System.out.println(finalMessage);
            System.out.println("quarters: " + quarters);
            System.out.println("dimes: " + dimes);
            System.out.println("nickels: " + nickles);
            System.out.println("pennies: " + pennies);
        }
        else{
            pennies = (int)(money/.01f);
            finalMessage = "The max amount of coins is " + pennies + " pennies";
            System.out.println(finalMessage);
        }
        
        scanner.close();
    }
}