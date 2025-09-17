package u1t4;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type in a number: ");
        double num = scanner.nextDouble();
        scanner.nextLine();
        while (true) {
            System.out.println("What do you wish to do with this number?\n add | subtract | multiply | divide | mod | add 1 | subtract 1");
            String action = scanner.nextLine();
            System.out.print("What do you want to " + action + " by? ");
            double actionNum = scanner.nextDouble();
            scanner.nextLine();
            if(action.equals("add")){
                num += actionNum;
            }
            else if(action.equals("subtract")){
                num -= actionNum;
            }
            else if(action.equals("multiply")){
                num *= actionNum;
            }
            else if(action.equals("divide")){
                num /= actionNum;
            }
            else if(action.equals("mod")){
                num %= actionNum;
            }
            else if(action.equals("add 1")){
                num++;
            }
            else{
                num--;
            }
            System.out.println("The number is now " + num);
        }
    }
}
