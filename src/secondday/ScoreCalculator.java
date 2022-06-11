package secondday;

import java.util.Scanner;

public class ScoreCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------성적 계산기-----");
        System.out.println("몇 과목을 듣나요?");
        int scoreCount = scanner.nextInt();
        int[] scoreArr = new int[scoreCount];
        int scoreSum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.println(i + 1 + "번쨰 과목 점수: ");
            int score = scanner.nextInt();
            if (score > 100 || score < 0) {
                System.out.println("형식에 맞지 않는 점수입니다.");
                i--;
                continue;
            }
            scoreArr[i] = score;
            scoreSum += score;
        }
        float scoreAvg = (float) scoreSum / scoreCount;
        System.out.println("과목별 평균은" + scoreAvg + "점입니다.");
        char level;
        if (scoreAvg > 90) {
            level = 'A';
        } else if (scoreAvg > 70) {
            level = 'B';
        } else if (scoreAvg > 50) {
            level = 'C';
        } else if (scoreAvg > 30) {
            level = 'D';
        } else {
            level = 'E';
        }
        System.out.println("성적은 " + level + "입니다.");
    }
}
