import java.util.Scanner;

public class EasterCompetition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countKozunak = Integer.parseInt(scan.nextLine());
        int points= 0;
        int maxEvaluation=Integer.MIN_VALUE;
        String maxName="";
        for (int i = 1; i <=countKozunak ; i++) {


            String name = scan.nextLine();
            String evolation =scan.nextLine();

            while (!evolation.equals("Stop")){
                int ocenka = Integer.parseInt(evolation);
                    points+=ocenka;
                   evolation=scan.nextLine();
            }
            System.out.printf("%s has %d points.%n",name,points);
            if(points>maxEvaluation){
                maxEvaluation=points;
                maxName=name;
                System.out.printf("%s is the new number 1!%n",name);
            }
            points=0;

        }
        System.out.printf("%s won competition with %d points!%n",maxName,maxEvaluation);
    }
}
