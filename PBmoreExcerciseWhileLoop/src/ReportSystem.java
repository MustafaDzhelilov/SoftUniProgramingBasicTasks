import java.text.DecimalFormat;
import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat dF = new DecimalFormat("#.00");

        int charitySum = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();

        double sumFromBr = 0;
        double sumFromCC = 0;
        int count = 0;
        int countOfbr= 0;
        int countOfCC = 0;
        boolean ok =false;
        double sumOfAll=0;
        double allSumInBr =0;
        double allSumInCC =0;

        while(!input.equals("End")){
            double money = Double.parseDouble(input);
            count++;
            if(count % 2 !=0){
                countOfbr++;
                if(money >100){
                    countOfbr-=1;
                    System.out.println("Error in transaction!");
                }else if(money <=100){
                    sumFromBr+=money;
                    System.out.println("Product sold!");
                }
            }if(count % 2 ==0){
                    countOfCC++;
                    if(money <10){
                        countOfCC-=1;
                        System.out.println("Error in transaction!");
                    }else  if(money >= 10){
                        sumFromCC+=money;
                        System.out.println("Product sold!");
                    }
            }
            sumOfAll=sumFromCC+sumFromBr;

            if(sumOfAll >= charitySum){
                ok=true;
                break;
            }

            input= scan.nextLine();
        }
        if(ok){
             allSumInBr =sumFromBr / countOfbr;
             allSumInCC = sumFromCC / countOfCC;
            System.out.println("Average CS: "+dF.format(allSumInBr));
            System.out.println("Average CC: "+dF.format(allSumInCC));
        }
        if(input.equals("End")){
            if(sumOfAll > charitySum){
                System.out.println("Failed to collect required money for charity.");
                System.out.println("Average CS: "+dF.format(allSumInBr));
                System.out.println("Average CC: "+dF.format(allSumInCC));
            }else {
                System.out.println("Failed to collect required money for charity.");
            }
        }
    }
}

