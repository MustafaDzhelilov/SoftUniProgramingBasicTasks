
import java.util.Scanner;

public class TimePlus15Minuts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int bonus = 15;

        int currentHour = Integer.parseInt(scan.nextLine());
        int currentMinuts = Integer.parseInt(scan.nextLine());

        int hourInMinuts = (currentHour * 60) + (currentMinuts) + bonus;
        int fromMinutToHour = hourInMinuts / 60;
        int minut = hourInMinuts % 60;

        if(fromMinutToHour == 24){
            fromMinutToHour = 0 ;
        }

        System.out.printf("%d:%02d",fromMinutToHour,minut);


    }

}
