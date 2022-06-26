package fourthday;

import java.util.Date;

public class MethodTest1 {
    float divide(int a, int b) {
        return (float) a / b;
    }

    void introduce(String name, int age) {
        System.out.println("저는 " + name + "입니다. 나이는 " + age + "입니다.");
    }

    Date today() {
        return new Date();
    }

    void diff(int a, int b) {
        System.out.println(a - b);
    }
}
