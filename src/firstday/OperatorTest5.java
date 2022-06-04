package firstday;

import java.util.Scanner;

public class OperatorTest5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" 정수를 입력하세요 (num):");
        int num = scan.nextInt();
        System.out.println("num: " + num);
        System.out.println("num++: " + num++);
        System.out.println("num: " + num);
        System.out.println("++num: " + ++num);
        System.out.println("num: " + num);
        System.out.println("num--: " + num--);
        System.out.println("num: " + num);
        System.out.println("--num: " + --num);
        System.out.println("num: " + num);

    }
}
