import java.lang.*;

public class ReverseNumber {
    public static void main(String args[]) {
        int number = 31971;
        String temp = Integer.toString(number);
        for (int i = 0; i < temp.length(); i++) {
            // access the length and decrese one each time then println
            System.out.print(temp.charAt((temp.length() - 1) - i));
        }
    }
}