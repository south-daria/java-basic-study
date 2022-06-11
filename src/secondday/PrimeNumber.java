package secondday;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("------ 소수 구하기 프로그램 ------");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n숫자를 입력하세요.");
            int num = scanner.nextInt();
            if (num == 1) {
                System.out.println("1은 소수가 아닙니다.\n");
            } else {
                boolean primeNum = true;
                for (int i = num - 1; i > 1; i--) {
                    if (num % i == 0) {
                        primeNum = false;
                        break;
                    }
                }
                if (primeNum == true) {
                    System.out.println(num + "은(는) 소수입니다.\n");
                } else {
                    System.out.println(num + "은(는) 소수가 아닙니다.\n");
                }
            }
            System.out.println("계속 하시겠습니까? 1:예 2:아니오");
            if (scanner.nextInt() != 1) {
                System.out.println("종료하겠습니다.\n");
                return;
            }
        }
    }
}
