package Lesson13.src;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 3;
        arr[1] = 4;
        arr[2] = 1;
        arr[3] = 3;
        arr[4] = 2;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int x = 7;
        System.out.println(Arrays.binarySearch(arr,x));
    }
}
