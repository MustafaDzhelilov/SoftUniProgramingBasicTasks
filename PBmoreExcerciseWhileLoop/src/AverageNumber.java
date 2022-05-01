import java.text.DecimalFormat;
import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat dF = new DecimalFormat("#.00");

        double n = Integer.parseInt(scan.nextLine());
        double sum = 0;

        for(int i = 1; i<=n; i++){
            int numbers = Integer.parseInt(scan.nextLine());
            sum+=numbers;
        }
        double result1 =sum/n;
        System.out.println(dF.format(result1));
    }
}
