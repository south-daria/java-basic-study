package secondday;

import java.util.Scanner;

public class GameOf369 {
    public static void main(String[] args) {
        System.out.println("----369게임----");
        Scanner scanner = new Scanner(System.in);
        System.out.println("마지막 숫자를 입력하세요.");
        int num = scanner.nextInt();
        if(num > 100){
            System.out.println("100이상은 입력할 수 없습니다.");
            return;
        }
        for(int i = 1; i<=num ; i++){
            int divide10 = i/10;
            if(divide10 == 3 || divide10 == 6 || divide10 == 9){
                switch(i%10){
                    case 3: case 6: case 9: System.out.print("짝짝 ");break;
                    default: System.out.print("짝 ");
                }
            }else{
                switch(i%10){
                    case 3: case 6: case 9: System.out.print("짝 ");break;
                    default: System.out.print(i + " ");
                }
            }
            if(i%10 == 0){
                System.out.println();
            }
        }
    }
}
