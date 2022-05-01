import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.StrictMath.floor;

public class earthRecordInSwiming {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        DecimalFormat dF = new DecimalFormat("#.00");

        double record = Double.parseDouble(scan.nextLine());
        double meters = Double.parseDouble(scan.nextLine());
        double timeForSwimingOneMeters = Double.parseDouble(scan.nextLine());

        double for15Meters = floor(meters/15) * 12.5;

        double sumOfSeconds = meters * timeForSwimingOneMeters +for15Meters;


        if(sumOfSeconds<record){
            System.out.println("Yes, he succeeded! The new world record is " + dF.format(sumOfSeconds) + " seconds.");
        }else{
            double needSecond = sumOfSeconds-record;
            System.out.println("No, he failed! He was " + dF.format(needSecond) + " seconds slower.");
        }
    }

}




