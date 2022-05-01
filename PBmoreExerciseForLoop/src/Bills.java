import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int month = Integer.parseInt(scan.nextLine());

        double water = 0;
        double net = 0;
        double sumOfElectricity = 0;
        double sumProcentage = 0;


        for(int i=1; i<=month; i++){
            double electricity = Double.parseDouble(scan.nextLine());
                sumOfElectricity+=electricity;
                water+=15;
                net+=20;
            sumProcentage +=(15+20+electricity)+((15 + 20 + electricity) *0.20);
        }
        double sumOfWater = 20 * month;
        double sumOfNet = 15* month;
        double average = (sumOfNet+sumOfWater+sumOfElectricity+sumProcentage)/month;

        System.out.printf("Electricity: %.2f lv%n",sumOfElectricity);
        System.out.printf("Water: %.2f lv%n",sumOfWater);
        System.out.printf("Internet: %.2f lv%n",sumOfNet);
        System.out.printf("Other: %.2f lv%n",sumProcentage);
        System.out.printf("Average: %.2f lv%n",average);

    }
}
