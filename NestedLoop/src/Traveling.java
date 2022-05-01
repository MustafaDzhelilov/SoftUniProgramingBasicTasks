import java.util.Scanner;

public class Traveling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String destination = scan.nextLine();



        while(!destination.equals("End")){
            double money = Double.parseDouble(scan.nextLine());
            double sum = 0;

            while (sum < money){
                double savedMoney = Double.parseDouble(scan.nextLine());
                sum+=savedMoney;
            }

                    System.out.printf("Going to %s!%n",destination);
                    destination= scan.nextLine();
            }

        }

    }

