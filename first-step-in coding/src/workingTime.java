import java.text.DecimalFormat;
import java.util.Scanner;

public class workingTime {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat dF = new DecimalFormat("#.#");

        int hour = Integer.parseInt(scan.nextLine());
        String day = scan.nextLine();

        String time = "";

        switch (day){

            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
                if(hour>=10 && hour<=18){
                    time = "open";
                    System.out.println(time);
                }if(hour < 10) {
                time = "closed";
                System.out.println(time);
            }if(hour >18){
                time = "closed";
                System.out.println(time);
            }
                break;
            default:
                System.out.println("closed");
                break;

        }


    }

}
