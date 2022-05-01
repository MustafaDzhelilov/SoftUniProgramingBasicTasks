import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double capacityTrunk = Double.parseDouble(scan.nextLine());
        String input = scan.nextLine();

        double sum = 0;
        int count = 0;
        boolean trunk = false;
        double procent = 0;

        while(!input.equals("End")){
            double suitcase = Double.parseDouble(input);
            sum+=suitcase;
            count++;
            if(count % 3 ==0){
                procent =suitcase*0.10;
                sum = procent + sum;
            }

            if(sum >capacityTrunk){
                trunk=true;
                count-=1;
                break;
            }
            input= scan.nextLine();
        }
        if("End".equals(input)){
            System.out.println("Congratulations! All suitcases are loaded!");
            System.out.printf("Statistic: %d suitcases loaded.",count);
        }
        if(trunk){
            System.out.println("No more space!");
            System.out.printf("Statistic: %d suitcases loaded.",count);
        }

    }
}
