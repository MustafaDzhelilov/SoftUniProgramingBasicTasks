import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countOfJury = Integer.parseInt(scan.nextLine());
        String nOcenka = scan.nextLine();

        double sumAll = 0;
        int count=0;
        while(!nOcenka.equals("Finish")){
            double sum = 0;
            for (int jury = 1; jury <=countOfJury ; jury++) {
                double ocenka = Double.parseDouble(scan.nextLine());
                count++;
                    sum+=ocenka;
                    sumAll+=ocenka;
            }
            double average = sum/countOfJury;
            System.out.printf("%s - %.2f.%n",nOcenka,average);
            nOcenka = scan.nextLine();
        }

            double  averageAll  = sumAll/count;
        System.out.printf("Student's final assessment is %.2f.",averageAll);
    }
}
