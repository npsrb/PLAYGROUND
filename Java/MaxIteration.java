public class MaxIteration {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            while (i + 1 < arr.length && arr[i] == arr[i + 1]) {
                count += 1;
                i += 1;
            }

            if (count > temp) {
                System.out.println("Current MAX Iteration Hold By: " + arr[i] + " With total iteration: " + count);
                temp = count;
            } else {
                System.out.println(arr[i] + " Thrown");
            }
        }
    }

}
