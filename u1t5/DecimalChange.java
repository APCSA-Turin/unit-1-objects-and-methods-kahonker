package u1t5;

import java.util.Scanner;

public class DecimalChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your number? ");
        double originalNum = scanner.nextDouble();
        int adjustedHundreds = (int)(((originalNum+100)%1000)/100);
        int adjustedTens = (int)(((originalNum+10)%100)/10);
        int adjustedOnes = (int)(((originalNum+1)%10));
        int adjustedTenths = (int)(((originalNum+.10001)%1)*10);
        int adjustedHundredths = (int)(((originalNum+.010001)%.1)*100);
        System.out.println("Your adjusted number is: " + adjustedHundreds + adjustedTens + adjustedOnes + "." + adjustedTenths + adjustedHundredths);

    }
}
