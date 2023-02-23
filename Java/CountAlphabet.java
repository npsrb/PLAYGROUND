public class CountAlphabet {
    public static void main(String[] args) {
        String alphabet = "aaabbbbbbcccddd";
        int counter = 1;
        for (int i = 0; i < alphabet.length(); i++) {
            while (i + 1 < alphabet.length() && alphabet.charAt(i) == alphabet.charAt(i + 1)) {
                counter++;
                i++;
            }
            System.out.println(alphabet.charAt(i) + " = " + counter);
            counter = 1;
        }
    }
}
