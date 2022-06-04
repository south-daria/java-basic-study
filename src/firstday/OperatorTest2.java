package firstday;

import java.util.Scanner;

public class OperatorTest2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(" 두개의 정수를 입력하세요 :");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("num1 : " + num1);
        num1 += num2;
        System.out.println("num1 += num2 : " + num1);
        num1 -= num2;
        System.out.println("num1 -= num2: " + num1);
        num1 *= num2;
        System.out.println("num1 *= num2: " + num1);
        num1 /= num2;
        System.out.println("num1 /= num2: " + num1);
        num1 %= num2;
        System.out.println("num1 %= num2: " + num1);
    }
}
