import java.util.Scanner;

public class SumOfChars_04 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int countChar = Integer.parseInt(sc.nextLine());
         int sum = 0;
        for (int i = 1; i <= countChar ; i++) {
            char symbol = sc.nextLine().charAt(0);
            sum +=(int)symbol;
        }
        System.out.println("The sum equals: " + sum);
    }
}
