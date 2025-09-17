package u1t5;

import java.util.Scanner;

public class averageCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the first value: ");
        double first = scanner.nextDouble();
        System.out.print("Please enter the second value: ");
        double second = scanner.nextDouble();
        System.out.print("Please enter the third value: ");
        double third = scanner.nextDouble();
        System.out.print("Please enter the fourth value: ");
        double fourth = scanner.nextDouble();
        scanner.nextLine();

        double average = (first+second+third+fourth)/4;
        System.out.println("The average is: " + average);
        int roundedAverage = (int) (average+.5); 
        System.out.println("The rounded average is: " + roundedAverage);

        if (roundedAverage >= 65){
            System.out.println("You are passing!");
        }
        else{
            System.out.println("You are failing!");
        }
    }
}
