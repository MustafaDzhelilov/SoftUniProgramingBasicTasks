import java.util.Scanner;

public class IntegerOperation_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = Integer.parseInt(sc.nextLine());
        int second  = Integer.parseInt(sc.nextLine());
        int third = Integer.parseInt(sc.nextLine());
        int four = Integer.parseInt(sc.nextLine());

        int sum = (((first + second) / third) * four);

        System.out.println(sum);
    }
}
