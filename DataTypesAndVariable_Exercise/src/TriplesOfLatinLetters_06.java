import java.util.Scanner;

public class TriplesOfLatinLetters_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputNumber = Integer.parseInt(sc.nextLine());

        for (char symbol1 = 'a'; symbol1 < 'a'+ inputNumber ; symbol1++) {
            for (int symbol2 = 'a'; symbol2 < 'a' + inputNumber ; symbol2++) {
                for (int symbol3 = 'a'; symbol3 < 'a' + inputNumber; symbol3++) {
                    System.out.printf("%c%c%c%n",symbol1,symbol2,symbol3);
                }
            }
        }
    }
}
