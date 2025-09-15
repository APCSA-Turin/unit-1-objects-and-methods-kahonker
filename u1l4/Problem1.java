package u1l4;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Welcome " + name + "!");
        System.out.print("Enter the first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int second = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int third = scanner.nextInt();
        double average = (first+second+third)/3;

        System.out.println("The average of " + first + ", " + second + ", and " +third + " is " + average);
        scanner.close();
    }
}
