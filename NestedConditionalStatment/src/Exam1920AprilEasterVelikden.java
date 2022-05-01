import java.util.Scanner;

public class Exam1920AprilEasterVelikden {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double price = 0;
        int countForPurchase = 0;
        double sumForPurchase = 0;
        double totalSum = 0;
        double proverka= 0;
        boolean procent = false;

        int countCostumers = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < countCostumers; i++) {
            countForPurchase = 0;
            sumForPurchase = 0;
            String typeOfPurchase = scan.nextLine();
            while (!typeOfPurchase.equals("Finish")) {
                switch (typeOfPurchase) {
                    case "basket":
                        price = 1.50;
                        break;
                    case "wreath":
                        price = 3.80;
                        break;
                    case "chocolate bunny":
                        price = 7;
                        break;
                }
                countForPurchase++;
                sumForPurchase += price;


                typeOfPurchase = scan.nextLine();

                if (typeOfPurchase.equals("Finish")) {
                    if (countForPurchase % 2 == 0) {
                        sumForPurchase = sumForPurchase - (sumForPurchase * 0.20);
                        procent=true;
                    }
                    totalSum+=sumForPurchase;
                    System.out.printf("You purchased %d items for %.2f leva.%n", countForPurchase, sumForPurchase);
                    break;
                }

            }
        }

        double averageBillPerClient = totalSum / countCostumers;
        System.out.printf("Average bill per client is: %.2f leva.", averageBillPerClient);

    }
}
