import java.text.DecimalFormat;
import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String money = scan.nextLine();
        double sum = 0;

        while(!money.equals("NoMoreMoney")){
            double currentAmount= Double.parseDouble(money);
            if(currentAmount < 0){
                System.out.println("Invalid operation!");
                break;
            }
            sum+=currentAmount;
            System.out.printf("Increase: %.2f%n",currentAmount);
            money = scan.nextLine();
        }
        System.out.printf("Total: %.2f",sum);
    }
}
