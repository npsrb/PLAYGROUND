public class PerfectString {
    public static void main(String[] args) {
        String Conversion = "SeLamAT PAGi semua halOo asd";
        String[] splited = Conversion.split("\\s+");
        for (int i = 0; i < splited.length; i++) {
            for (int a = 0; a < splited[i].length(); a++) {
                if (a == 0) {
                    System.out.print(Character.toUpperCase(splited[i].charAt(0)));
                } else {
                    System.out.print(Character.toLowerCase(splited[i].charAt(a)));
                }
            }
            System.out.print(" ");
        }
    }
}
