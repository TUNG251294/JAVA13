package Lesson13.src;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int array[] = {9,7,1,3,2,5,8,6};
        int pos, x;
        for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }
        System.out.println(Arrays.toString(array));
    }
}