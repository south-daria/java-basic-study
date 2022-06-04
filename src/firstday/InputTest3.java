package firstday;

import java.util.Scanner;

public class InputTest3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        String name;

        System.out.println("---입력---");
        System.out.print("이름 입력:");
        name = input.next();
        System.out.print("나이: ");
        age = input.nextInt();
        System.out.println("---출력---");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
    }
}
