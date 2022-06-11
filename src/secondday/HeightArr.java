package secondday;

import java.util.Arrays;
import java.util.Scanner;

public class HeightArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("학생은 몇명인가요?");
        int studentCount = scanner.nextInt();
        int heightArr[] = new int[studentCount];

        for (int i = 0; i < heightArr.length; i++) {
            System.out.println(i + 1 + "번쨰 학생 키 : ");
            heightArr[i] = scanner.nextInt();
        }
        Arrays.sort(heightArr);
        System.out.println(Arrays.toString(heightArr));
        int temp;
        for (int i = 0; i < heightArr.length; i++) {
            for (int j = 0; j < heightArr.length - i - 1; j++) {
                if (heightArr[j] > heightArr[j + 1]) {
                    temp = heightArr[j];
                    heightArr[j] = heightArr[j + 1];
                    heightArr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(heightArr));
    }
}
