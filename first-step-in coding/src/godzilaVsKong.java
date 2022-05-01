import java.text.DecimalFormat;
import java.util.Scanner;


    public class godzilaVsKong {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            DecimalFormat dF = new DecimalFormat("#.00");

            double budget = Double.parseDouble(scan.nextLine());
            int brStatist = Integer.parseInt(scan.nextLine());
            double priceForClothesForStatist = Double.parseDouble(scan.nextLine());

            double decorate = 0.1 * budget;
            double priceForStatist = brStatist *priceForClothesForStatist;

            double needMoney = 0;
            double moneyLeft = 0;
            double priceForClothes = 0;
            double expenses = 0;

            if(brStatist>=150){
                double disc = 0.1 * priceForStatist;
                priceForClothes = priceForStatist-disc;
                expenses = priceForClothes+decorate;
            }else {
                expenses = priceForStatist + decorate;
            }



            if(expenses>budget){
                System.out.println("Not enough money!");
                needMoney = expenses-budget;
                System.out.println("Wingard needs "+dF.format(needMoney)+" leva more.");

            }else if(expenses<=budget){
                System.out.println("Action!");
                moneyLeft = budget-expenses;
                System.out.println("Wingard starts filming with " + dF.format(moneyLeft)+" leva left.");
            }

        }

    }




