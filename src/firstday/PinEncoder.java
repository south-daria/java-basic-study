package firstday;

import java.util.Scanner;

public class PinEncoder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("-----암호 구현하기-----");
        System.out.println("남친 생일(MMDD):");
        int bfBirth = scan.nextInt();
        System.out.println("내 생일(MMDD):");
        int myBirth = scan.nextInt();
        int pin = ((bfBirth * 8) - bfBirth + myBirth + (myBirth % 100) + (bfBirth / 100));
        System.out.println("암호: " + pin);
        System.out.println("-------------------");
    }
}

//    남자친구가 생겼다!
//        하지만 극유교주의인 우리 집.
//        엄마에게 걸리지 않기 위해 특이한 암호를 만들기로 했다.
//        혹시나 잊어버릴까 일기장에 만든 공식을 적어놓았다.
//
//        * 남자친구 생일과 내 생일을 입력받도록 한다.
//
//        암호(*****) = 남자친구 생일(MMDD) * 8 - 남자친구 생일(MMDD) + 내 생일(MMDD) + 내 생일 (DD) + 남자친구 생일 (MM)
//        남자친구 생일(0412)
//        내 생일(0821)
//        암호 (3730)

