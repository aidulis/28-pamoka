public class ciklai4 {
    public static void main(String[] args) {
        String str = "maras";
        char ch = 'a';

        System.out.println("Character " + ch + " occurs " + countOccurrences(str, ch) + " times.");
    }

    public static int countOccurrences(String str, char ch) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                counter++;
            }
        }

        return counter;
    }
}
