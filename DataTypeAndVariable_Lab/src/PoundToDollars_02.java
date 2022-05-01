import java.util.Scanner;

public class PoundToDollars_02 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        double countPound = Double.parseDouble(sc.nextLine());
        double courseDollarsToPounds = 1.31;
        double convertSum = countPound *courseDollarsToPounds;
        System.out.printf("%.3f",convertSum);
    }
}
