package U1L3;

public class test {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 15;
        System.out.println("num1 = " + num1 + " num2 = " + num2);
        int temp = num2;
        num2 = num1;
        num1 = temp;
        System.out.println("num1 = " + num1 + " num2 = " + num2);


    }
}
