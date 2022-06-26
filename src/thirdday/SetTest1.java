package thirdday;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetTest1 {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6));
        if (set1.retainAll(set2)) {
            System.out.println("set1는 set2을 모두 포함하고 있습니다.");
        } else {
            System.out.println("set2에 set1에 포함되지 않은 값이 있습니다.");
        }
        set1.remove(4);
        if (set1.retainAll(set2)) {
            System.out.println("set1는 set2을 모두 포함하고 있습니다.");
        } else {
            System.out.println("set2에 set1에 포함되지 않은 값이 있습니다.");
        }

    }
}
