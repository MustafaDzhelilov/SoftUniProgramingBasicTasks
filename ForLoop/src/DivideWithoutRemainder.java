import java.text.DecimalFormat;
import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat dF = new DecimalFormat("0.00");

        int n = Integer.parseInt(scan.nextLine());

        double divideWithout2 = 0;
        double divideWithout3 = 0;
        double divideWithout4 = 0;
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;

        for (int i = 1; i <= n; i++) {
            int count = Integer.parseInt(scan.nextLine());
            if (count % 2 == 0) {
                divideWithout2 += 1;
            } if (count % 3 == 0) {
                divideWithout3 += 1;
            } if (count % 4 == 0) {
                divideWithout4 += 1;
            }
        }
        p1 = divideWithout2 / n * 100;
        p2 = divideWithout3 / n * 100;
        p3 = divideWithout4 / n * 100;

        System.out.println(dF.format(p1)+"%");
        System.out.println(dF.format(p2)+"%");
        System.out.println(dF.format(p3)+"%");
    }
}
