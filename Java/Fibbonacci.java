public class Fibbonacci {
    public static void main(String[] args) {
        int loop_me = 8;
        int i = 0;
        int start_here = 0;
        int add_me = 1;
        int temp;
        System.out.print(start_here + ",");
        while (i < loop_me) {
            temp = start_here + add_me;
            add_me = start_here;
            start_here = temp;
            System.out.print(temp + ",");
            i++;
        }
    }
}
