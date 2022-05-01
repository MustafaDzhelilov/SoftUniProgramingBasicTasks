import java.text.DecimalFormat;
import java.util.Scanner;

public class Logistic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat dF = new DecimalFormat("#.00");

        int countOfCargo = Integer.parseInt(scan.nextLine());
        double bus = 0;
        double truck = 0;
        double train = 0;
        double allKg = 0;

        for(int i =1; i<=countOfCargo; i++){
            int kgOfCargo = Integer.parseInt(scan.nextLine());
            allKg+=kgOfCargo;
            if(kgOfCargo <= 3){
                bus+=kgOfCargo;
            }else if(kgOfCargo <=11){
                truck+=kgOfCargo;
            }if(kgOfCargo >=12){
                train+=kgOfCargo;
            }
        }
        double all = (bus*200 + truck*175 + train*120)/allKg;
        double allBus = bus/allKg*100;
        double allTruck = truck/allKg*100;
        double allTrain = train/allKg*100;

        System.out.printf("%.2f%n",all);
        System.out.printf("%.2f%%%n",allBus);
        System.out.printf("%.2f%%%n",allTruck);
        System.out.printf("%.2f%%%n",allTrain);

    }
}
