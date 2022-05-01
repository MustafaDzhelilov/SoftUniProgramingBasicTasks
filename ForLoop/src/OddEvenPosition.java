import java.text.DecimalFormat;
import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat dF = new DecimalFormat("0.00");

        int n = Integer.parseInt(scan.nextLine());

        double evenSum = 0;
        double oddSum = 0;
        double oddMin = 1000000000.0 ;
        double oddMax = -1000000000.0 ;
        double evenMin = 1000000000.0 ;
        double evenMax = -1000000000.0 ;
        double number= 0;

        for (int i = 1; i <= n; i++) {
            number = Double.parseDouble(scan.nextLine());
            if (i % 2 == 0) {
                evenSum += number;

                if (number < evenMin) {
                    evenMin = number;
                }
                if (number > evenMax) {
                    evenMax = number;
                }
            }
            if (i % 2 != 0) {
                oddSum += number;

                if (number < oddMin) {
                    oddMin = number;
                }
                if (number > oddMax) {
                    oddMax = number;
                }
            }

        }

        System.out.println("OddSum="+dF.format(oddSum)+",");
        if(oddMin ==1000000000.0){
            System.out.println("OddMin=No,");
        }else{
            System.out.println("OddMin=" + dF.format(oddMin) + ",");
        }
        if(oddMax ==-1000000000.0){
            System.out.println("OddMax=No,");
        }else {
            System.out.println("OddMax=" + dF.format(oddMax) + ",");
        }
        System.out.println("EvenSum="+dF.format(evenSum)+",");
        if(evenMin == 1000000000.0){
            System.out.println("EvenMin=No,");
        }else{
            System.out.println("EvenMin=" + dF.format(evenMin) + ",");
        }
        if(evenMax == -1000000000.0){
            System.out.println("EvenMax=No");
        }else {
            System.out.println("EvenMax=" + dF.format(evenMax));
        }

    }
}

