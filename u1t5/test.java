package u1t5;

public class test {
    public static void main(String[] args) {
        int someBigPosNum = 2147483600;   // 47 less than max
        int someBigNegNum = -2147483600;  // 48 greater than min
        System.out.println("big pos num = " + someBigPosNum);
        System.out.println("big neg num = " + someBigNegNum);
        someBigPosNum += 100;  // this will cause the value to exceed max
        someBigNegNum -= 100;  // this will cause the value to go below min
        System.out.println("updated big pos num = " + someBigPosNum);
        System.out.println("updated big neg num = " + someBigNegNum);
    }
}
