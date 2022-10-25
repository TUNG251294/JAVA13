package Lesson13.src.SetAlgorithm;

public class Main extends SetAlgorithm{ /*phải kế thừa thì mới lấy được đối tượng và phương thức từ class khác*/
    public static void main(String[] args) {
        System.out.println(binarySearch(list, 2));
        System.out.println(binarySearch(list, 11));
        System.out.println(binarySearch(list, 79));
        System.out.println(binarySearch(list, 1));
        System.out.println(binarySearch(list, 5));
        System.out.println(binarySearch(list, 80));
    }
}
