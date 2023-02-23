import java.util.Arrays;

public class PrintSecondLargest {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 6, 9, 9 };
        int total = arr.length;
        Arrays.sort(arr);
        System.out.println(arr[total - 2]);
    }
}
