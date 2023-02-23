public class Conversion {
    public static void main(String[] args) {
        String ConvertME = "aabbebcccdddg";
        for (int i = 0; i < ConvertME.length(); i++) {
            int counter = 1;
            while (i + 1 < ConvertME.length() && ConvertME.charAt(i) == ConvertME.charAt(i + 1)) {
                counter += 1;
                i += 1;
            }
            System.out.print(ConvertME.charAt(i));
            System.out.print(counter);
        }
    }
}
