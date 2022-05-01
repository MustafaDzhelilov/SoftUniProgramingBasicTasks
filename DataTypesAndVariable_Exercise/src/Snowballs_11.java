import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n  = Integer.parseInt(sc.nextLine());

        double maxValue = Double.MIN_VALUE;
        int newSnowballSnow = 0;
        int newSnowballTime= 0;
        int newSnowBallQuality = 0;

        for (int i = 0; i <n ; i++) {

            int snowBallSnow = Integer.parseInt(sc.nextLine());
            int snowBallTime = Integer.parseInt(sc.nextLine());
            int snowBallQuality = Integer.parseInt(sc.nextLine());

            int division = snowBallSnow /snowBallTime;

           double  snowBallValue = Math.pow(division, snowBallQuality);

            if(snowBallValue > maxValue){
                maxValue =snowBallValue;
                newSnowballSnow = snowBallSnow;
                newSnowballTime = snowBallTime;
                newSnowBallQuality = snowBallQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)",newSnowballSnow,newSnowballTime,maxValue,newSnowBallQuality);
    }
}
