import java.text.DecimalFormat;
import java.util.Scanner;

public class cleverLilly {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
       DecimalFormat dF = new DecimalFormat("#.00");

        int ageOfLilly = Integer.parseInt(scan.nextLine());
        double priceOfWasher = Double.parseDouble(scan.nextLine());
        int priceOfToys = Integer.parseInt(scan.nextLine());

        int evenCount = 0;
        int oddCount = 0;
        int sumOfMoney = 0;

        for(int i = 1; i<=ageOfLilly; i++) {
           if(i % 2 == 0){
               evenCount+=10;
               sumOfMoney+=evenCount;
           }else{
               oddCount+=1;
           }
        }
        int dif = Math.abs(sumOfMoney -evenCount);
        int result = dif + (oddCount * priceOfToys)-(ageOfLilly-oddCount);
        if(result >=priceOfWasher){
            double leftMoney = result - priceOfWasher;
            System.out.println("Yes! "+dF.format(leftMoney));
        }else{
            double needMoney = Math.abs(result-priceOfWasher);
            System.out.println("No! "+dF.format(needMoney));
        }
    }
}
