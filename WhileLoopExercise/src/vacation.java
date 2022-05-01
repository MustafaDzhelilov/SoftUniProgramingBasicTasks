import java.util.Scanner;

public class vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double moneyNeededForVacation = Double.parseDouble(scan.nextLine());
        double currentMoneyInTime = Double.parseDouble(scan.nextLine());

        int countOfSpend = 0;
        int daysCounter = 0;

        while (currentMoneyInTime < moneyNeededForVacation && countOfSpend < 5) {
            String actionInTime = scan.nextLine();
            double money = Double.parseDouble(scan.nextLine());
            daysCounter++;

            if ("save".equals(actionInTime)) {
                currentMoneyInTime += money;
                countOfSpend = 0;
            } else if ("spend".equals(actionInTime)) {
                currentMoneyInTime -= money;
                countOfSpend += 1;
                if (currentMoneyInTime < 0) {
                    currentMoneyInTime = 0;
                }
            }
        }
            if (countOfSpend == 5) {
                System.out.println("You can't save the money.");
                System.out.println(daysCounter);
            } if(currentMoneyInTime >= moneyNeededForVacation){
                System.out.printf("You saved the money for %d days.", daysCounter);
            }

    }
}