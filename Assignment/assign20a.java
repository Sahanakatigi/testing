package mypackage;

public class assign20a {

    public static void main(String[] args) {
        int countspl = 0;
        String sc = " Check f@r %^& ** ";
        char sc1[] = sc.toCharArray();

        for (int i = 0; i < sc.length(); i++) {
            char c = sc1[i];
            if (!Character.isLetter(c) && !Character.isWhitespace(c) && !Character.isAlphabetic(i)) {
                countspl++;
            }
        }

        System.out.println("Special character count: " + countspl);
    }
}