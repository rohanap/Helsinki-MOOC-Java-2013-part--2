
public class Smileys {

    public static void main(String[] args) {
        //Test your method at least with the following

        printWithSmileys("\\:D/");
        printWithSmileys("87.");
        System.out.println();
    }

    private static void printWithSmileys(String charecterString) {

        int length = charecterString.length();

        String a = charecterString.length() % 2 == 1 ? " " : "";
        String middleRow = ":) " + charecterString + a + " :)";

        print(middleRow.length() / 2);
        System.out.println("");
        System.out.println(middleRow);
        print(middleRow.length() / 2);
        System.out.println("");

    }

    private static void print(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(":)");

        }
    }

}
