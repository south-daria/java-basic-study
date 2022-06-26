package fourthday;

public class ObjectUseTest1 {
    public static void main(String[] args) {
        MethodTest1 methodTest1 = new MethodTest1();
        methodTest1.divide(5,2);
        System.out.println(methodTest1.divide(5,2 ));
        methodTest1.introduce("yooa",27);
        methodTest1.today();
        System.out.println(methodTest1.today());
        methodTest1.diff(10,20);
    }
}

//값을 받지 않고 오늘 날짜를 반환하는 메소드 → new Date()를 사용