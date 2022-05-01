import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);




        int countLocation = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <=countLocation ; i++) {
            double sum=0;
            int averageGold = Integer.parseInt(scan.nextLine());
            int countDay = Integer.parseInt(scan.nextLine());
            for (int j = 1; j <=countDay ; j++) {
               double perDay=Double.parseDouble(scan.nextLine());
                sum+=perDay;
            }
            double avarage = sum/countDay;
            if(avarage>=averageGold){
                System.out.printf("Good job! Average gold per day: %.2f.%n",avarage);
            }else{
                System.out.printf("You need %.2f gold.%n",Math.abs(averageGold-avarage));
            }
            
        }

    }
}