package u1t4;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Player 1 name: ");
        String playerOneName = scanner.nextLine();
        System.out.print("Enter Player 1 number: "); 
        double playerOneNum = scanner.nextDouble();  
        scanner.nextLine(); 
        System.out.print("Enter Player 2 name: ");
        String playerTwoName = scanner.nextLine();
        System.out.print("Enter Player 2 number: "); 
        double playerTwoNum = scanner.nextDouble();
        scanner.nextLine();

        if (playerOneNum > playerTwoNum){
            System.out.println(playerOneName + " has a higher number!");
        }
        else if(playerTwoNum > playerOneNum){
            System.out.println(playerTwoName + " has a higher number!");
        }
        else{
            System.out.println("The numbers are equal!");
        }
        scanner.close();
    }
}
