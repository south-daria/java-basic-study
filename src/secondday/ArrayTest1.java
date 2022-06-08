package secondday;

import java.util.Arrays;

public class ArrayTest1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.stream(arr).sum());
    }
}
