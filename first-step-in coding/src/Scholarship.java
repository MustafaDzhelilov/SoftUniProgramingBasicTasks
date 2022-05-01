import java.text.DecimalFormat;
import java.util.Scanner;

public class Scholarship {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        DecimalFormat dF = new DecimalFormat("#.#");

        double incomes = Double.parseDouble(scan.nextLine());
        double avarageSucces = Double.parseDouble(scan.nextLine());
        double salary = Double.parseDouble(scan.nextLine());

        double social = 0;
        double excelent = 0;

        if ((incomes > salary) && (5.5 > avarageSucces)) {
            System.out.printf("You cannot get a scholarship!");
        } else {
            if ((incomes < salary) && (avarageSucces > 4.5)) {
                social = 0.35 * salary;
                System.out.printf("You get a Social scholarship " + dF.format(social) + " BGN");
            } else {
                if (avarageSucces >= 5.5) {
                    excelent = avarageSucces * 25;
                    if ((avarageSucces >= 5.5) && (excelent >= social)) {
                        System.out.printf("You get a scholarship for excellent results " + dF.format(excelent) + " BGN");
                    }
                }
            }
        }

    }
}










