import java.util.Scanner;

public class CenturiesToMinute_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int centuries = Integer.parseInt(sc.nextLine());

        int centuriesToYears = centuries * 100;
        double  yearsToDay = centuriesToYears * 365.2422;
        int conv = (int)(yearsToDay);
        int yearsToHours = (int)(yearsToDay) * 24;
        int hoursToMinutes = yearsToHours * 60;

        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes",centuries,centuriesToYears,conv,yearsToHours,hoursToMinutes);
    }
}
