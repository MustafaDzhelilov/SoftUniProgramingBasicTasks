import java.text.DecimalFormat;
import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        DecimalFormat dF = new DecimalFormat("#.##");

        int bootle = Integer.parseInt(scan.nextLine());
        int botleInMl = bootle * 750;
        String input = scan.nextLine();
        double sum = 0;
        int count = 0;
        int countOfPots = 0;
        boolean tendjeri = false;
        double pots = 0;

        while(!input.equals("End")){
            int cutlery = Integer.parseInt(input);
            sum+=cutlery;
            count++;

            if(count % 3==0){
               tendjeri =true;
               sum-=cutlery;
                countOfPots +=cutlery;
            }
            double mejResultOfDish = sum * 0.05 *100;
            double mejResultOfPots = countOfPots * 0.15 *100;

            if((mejResultOfDish+mejResultOfPots > botleInMl)){
                break;
            }
            input = scan.nextLine();
        }
        double dishes = sum * 0.05;

        if(tendjeri){
            pots = countOfPots * 0.15;
        }

        if(((dishes+pots)*100) > botleInMl){
            double needBootle = ((dishes+pots)*100)-botleInMl;
            System.out.println("Not enough detergent, "+dF.format(needBootle)+ " ml. more necessary!");
        }
        if(((dishes+pots)*100) <= botleInMl){
            double leftBootle = botleInMl-((dishes+pots)*100);
            System.out.println("Detergent was enough!");
            System.out.println(dF.format(sum)+" dishes and "+countOfPots+ " pots were washed.");
            System.out.println("Leftover detergent "+dF.format(leftBootle)+" ml.");
        }
    }
}
