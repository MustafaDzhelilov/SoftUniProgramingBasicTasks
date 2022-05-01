import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfDayTournament = Integer.parseInt(scan.nextLine());
        double sum = 0;
        int winC = 0;
        int loseC = 0;
        int totalWinC = 0;
        int totalLoseC = 0;
        double totalSum = 0;

        for (int i = 0; i < countOfDayTournament; i++) {
            sum = 0;
            winC=0;
            loseC=0;
            String typeOfSport = scan.nextLine();
            while (!typeOfSport.equals("Finish")) {
                String result = scan.nextLine();
                if (result.equals("win")) {
                    sum += 20;
                    winC++;

                }else{
                    sum += 0;
                    loseC++;
                }
                typeOfSport = scan.nextLine();
                if (typeOfSport.equals("Finish")){
                    break;
                }
            }
            totalWinC +=winC;
            totalLoseC +=loseC;

            if (winC > loseC) {
                sum = sum + (sum * 0.10);
            }
            totalSum += sum;
        }
        if (totalWinC > totalLoseC) {
            totalSum = totalSum + (totalSum * 0.20);
            System.out.printf("You won the tournament! Total raised money: %.2f", totalSum);
        }if (totalWinC < totalLoseC) {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalSum);
        }


    }
}