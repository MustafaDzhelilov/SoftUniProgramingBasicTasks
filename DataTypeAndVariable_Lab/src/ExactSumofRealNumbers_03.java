import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumofRealNumbers_03 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n =Integer.parseInt(sc.nextLine());

        BigDecimal sum = new BigDecimal(0);
        for (int i = 0; i <n ; i++) {
            String numberFromUser = sc.nextLine();
            BigDecimal number = new BigDecimal(numberFromUser);
            sum = sum.add(number);
        }
        System.out.println(sum);

    }
}
