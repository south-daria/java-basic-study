package firstday;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        System.out.println("-----BMI 계산기-----");
        Scanner scan=new Scanner(System.in);
        System.out.println("이름 :");
        String name = scan.next();
        System.out.println("키 :");
        float height = (float) (scan.nextFloat()/100.0);
        System.out.println("몸무게 :");
        float weight = scan.nextFloat();
        System.out.println(name + "님의 BMI는 " + (weight / (height * height))+ " 입니다.");
    }
}

//    키와 몸무게를 입력받아 BMI를 출력하는 코드를 구현해보자.
//    키가 170, 몸무게가 73 일 때, 계산식 : 73/ (1.7*1.7)
