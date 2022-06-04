package firstday;

import java.util.Scanner;

public class PinDencoder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("-----암호 구현하기-----");
        System.out.println("암호:");
        int pin = scan.nextInt();
        System.out.println("딸 생일(MMDD):");
        int dauBirth = scan.nextInt();

        int bfBirth = (pin - dauBirth - (dauBirth / 100)) / 7;
        System.out.println("남친생일(MMDD): " + bfBirth);
        System.out.println("-------------------");
    }
}

//    딸의 일기장을 보니 남자친구가 생긴 것 같다.
//
//        생일이 곧 다가오는 것 같은데, 그 날에 못 나가게 해야겠다.
//        암호는 ***** 인데 남자친구 생일은 언제인가?
//
//        * 암호와 딸의 생일을 입력받도록 한다.
//
//        암호(*****) = 남자친구 생일(MMDD) * 7 + 딸 생일(MMDD) + 딸 생일 (MM)
//
//        ex)
//        암호 (9603)
//        남자친구 생일(1227)
//        딸 생일(1004)

