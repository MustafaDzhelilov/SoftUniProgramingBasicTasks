import java.text.DecimalFormat;
import java.util.Scanner;

public class examFoodForPeds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat dF = new DecimalFormat("0.00");

        double days = Double.parseDouble(scan.nextLine());
        double quantity =Double.parseDouble(scan.nextLine());

        double dog = 0;
        double cat = 0 ;
        double quantityOfDog =0;
        double quantityOfCat =0;
        double bisc = 0;

        for(int i=1; i<=days; i++){
            quantityOfDog = Double.parseDouble(scan.nextLine());
            quantityOfCat = Double.parseDouble(scan.nextLine());

            dog+=quantityOfDog;
            cat+=quantityOfCat;

            if(i % 3 ==0){
                bisc += (quantityOfCat+quantityOfDog)*0.10;
            }
        }
        double procentageOfAll= (dog+cat) / quantity * 100;
        double procentageOfDog = (dog /(dog+cat)) *100;
        double procentageOfCat = (cat / (dog+cat)) * 100;

        System.out.println("Total eaten biscuits: " + Math.round(bisc) + "gr.");
        System.out.println(dF.format(procentageOfAll) + "% of the food has been eaten.");
        System.out.println(dF.format(procentageOfDog) + "% eaten from the dog.");
        System.out.println(dF.format(procentageOfCat) + "% eaten from the cat.");
    }
}
