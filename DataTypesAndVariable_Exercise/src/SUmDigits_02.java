import java.util.Scanner;

public class SUmDigits_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNumber = Integer.parseInt(sc.nextLine());
        int sum = 0;
        while ( inputNumber > 0) {
            int lastDigit = inputNumber % 10;
            inputNumber = inputNumber / 10;
            sum += lastDigit;
        }
        System.out.println(sum);

    }
}
