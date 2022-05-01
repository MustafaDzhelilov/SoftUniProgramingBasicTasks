import java.text.DecimalFormat;
import java.util.Scanner;

public class Hristogram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat dF = new DecimalFormat("0.00");

        int n = Integer.parseInt(scan.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;
        double first = 0;
        double second = 0;
        double tirth = 0;
        double quater = 0;
        double fifth = 0;

        for (int i = 1; i <= n; i++) {
            int count = Integer.parseInt(scan.nextLine());
            if (count < 200) {
                first += 1;
            } else if (count > 199 && count <= 399) {
                second += 1;
            } else if (count > 399 && count <= 599) {
                tirth += 1;
            } else if (count > 599 && count <= 799) {
                quater += 1;
            } else if (count > 799) {
                fifth += 1;
            }
        }
        p1 = first / n * 100;
        p2 = second / n * 100;
        p3 = tirth / n * 100;
        p4 = quater / n * 100;
        p5 = fifth / n * 100;


        System.out.println(dF.format(p1)+"%");
        System.out.println(dF.format(p2)+"%");
        System.out.println(dF.format(p3)+"%");
        System.out.println(dF.format(p4)+"%");
        System.out.println(dF.format(p5)+"%");
    }
}
