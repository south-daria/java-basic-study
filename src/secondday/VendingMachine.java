package secondday;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        System.out.println("-----자판기 프로그램-----");
        Scanner scanner = new Scanner(System.in);
        System.out.println("금액: ");
        int money = scanner.nextInt();
        int[] menuAmount = {1500, 1800, 1000};
        while (true) {
            System.out.println("1)오렌지주스: 1500원, 2)파워에이드: 1800원, 3)생수: 1000원 4)미선택");
            int num = scanner.nextInt();
            if (num == 4) {
                break;
            }
            if (money - menuAmount[num - 1] < 0) {
                System.out.println("돈이 부족합니다. ㅠㅠ");
                continue;
            }
            money -= menuAmount[num - 1];
            switch (num) {
                case 1:
                    System.out.println("오렌지 주스 주문하셨습니다.");
                    break;
                case 2:
                    System.out.println("파워에이드 주문하셨습니다.");
                    break;
                case 3:
                    System.out.println("생수 주문하셨습니다.");
                    break;
            }
            System.out.println("남은 잔액: " + money);
        }
        int countOf1000 = money / 1000;
        money %= 1000;
        int countOf500 = money / 500;
        money %= 500;
        int countOf100 = money / 100;
        System.out.println("잔돈 반환 - 1000원: " + countOf1000 + "개,  500원 " + countOf500 + "개, 100원 " + countOf100 + "개");
    }
}
