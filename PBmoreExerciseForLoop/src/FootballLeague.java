import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double capacity = Double.parseDouble(scan.nextLine());
        double countOfFens = Double.parseDouble(scan.nextLine());

        double countA = 0;
        double countB= 0;
        double countV = 0;
        double countG = 0;

        for(int i =1; i<=countOfFens; i++){
            String sectors = scan.nextLine();

            if(sectors.equals("A")){
                countA++;
            }
            if(sectors.equals("B")){
                countB++;
            }
            if(sectors.equals(("V"))){
                countV++;
            }
            if(sectors.equals("G")){
                countG++;
            }

        }
        double allA = countA/countOfFens*100;
        double allB = countB/countOfFens*100;
        double allV = countV/countOfFens*100;
        double allG = countG/countOfFens*100;
        double all = countOfFens/capacity*100;

        System.out.printf("%.2f%%%n",allA);
        System.out.printf("%.2f%%%n",allB);
        System.out.printf("%.2f%%%n",allV);
        System.out.printf("%.2f%%%n",allG);
        System.out.printf("%.2f%%%n",all);
    }
}
