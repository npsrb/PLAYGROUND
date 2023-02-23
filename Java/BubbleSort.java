public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 80, 10, 30, 20, 50, 30, 60, 40, 60 };
        for (int i = 0; i < arr.length; i++) {
            // iteration 1 = 0;
            // if no 1 it will out of bonds because array start with 0
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // pindah posisi, temporary digunakan sebagai temp variabel pertama dan kedua
                    // komparasi
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
