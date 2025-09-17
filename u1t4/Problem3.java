package u1t4;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a three digit number: ");
        int num = scanner.nextInt();
        int modTen = num % 10;
        int modHundred = ((num % 100) - modTen) / 10;
        int modThousand = ((num % 1000) - modHundred - modTen) / 100;
        System.out.println("The reverse of " + num + " is " + modTen + modHundred + modThousand);
        scanner.close();
    }
}
