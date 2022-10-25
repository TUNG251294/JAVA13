package Lesson13.src.ToSortString;

import java.util.*;

public class ToSortString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string");
        String str = scanner.nextLine();
        // charArr [W,e,l,c,o,m,e]
        Map<String,Integer> map = new HashMap<>();  /*Bai nay khong de key kieu Integer vi map khong cho key trung lap*/

        for (int i = 0; i < str.length(); i++) {
            ArrayList<Character> arrList = new ArrayList<>();
            arrList.add(str.charAt(i));
            for (int j = i; j < str.length() -1; j++) {    /*MAX(j + 1) = Length - 1 = MaxIndex*/
                if (str.charAt(j+1) > str.charAt(j)) {
                    arrList.add(str.charAt(j + 1));
                }
            }
            System.out.println(arrList.size());
            map.put(arrList.toString(),arrList.size());
        }
        System.out.println(map);
        Set<String> keys = map.keySet();
        int maxLength = 0;
        for (String k: keys){
            if(map.get(k) > maxLength){
                maxLength = map.get(k);
            }
            System.out.println(k+"-"+map.get(k));
//            if (k.length()>maxLength){
//                maxLength = k.length();
//            }
//            System.out.println(k);
//            System.out.println(k.length());
        }
        for (String k: keys){
            if(map.get(k) == maxLength){
                System.out.println(k);
            }
        }
    }
}
