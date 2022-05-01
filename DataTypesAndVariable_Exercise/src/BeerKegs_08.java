import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double maxValue = Double.MIN_VALUE;
        String maxKeg = "";

        int countKeg = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= countKeg ; i++) {
            String kegModel = sc.nextLine();
            double kegRadius = Double.parseDouble(sc.nextLine());
            int kegHeight = Integer.parseInt(sc.nextLine());

            double sum = Math.PI * Math.pow(kegRadius,2) * kegHeight;

            if(sum > maxValue){
                maxValue =sum;
                maxKeg = kegModel;
            }
        }
        System.out.printf("%s",maxKeg);

    }
}
