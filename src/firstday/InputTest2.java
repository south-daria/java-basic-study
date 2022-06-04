package firstday;

import java.io.IOException;

public class InputTest2 {
    public static void main(String[] args) throws IOException {
        System.out.print("문자 입력: ");
        int num = System.in.read();
        System.out.println("==== 출 력 ====");
        System.out.println("입력하신 문자 :" + (char)num);
        System.out.println("소문자로 변환 :" + (char)(num+32));

    }
}
