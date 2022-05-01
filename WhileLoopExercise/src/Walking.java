import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sumOfSteps = 0;

        String input = scan.nextLine();

        while(!input.equals("Going home")){
            int steps = Integer.parseInt(input);
            sumOfSteps+=steps;

            if(sumOfSteps >=10000){
                break;
            }
            input = scan.nextLine();
        }
        if(input.equals("Going home")){
            int stepsToHome = Integer.parseInt(scan.nextLine());
            sumOfSteps+=stepsToHome;
        }
        if(sumOfSteps >=10000){
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", sumOfSteps - 10000);
        }else{
            System.out.printf("%d more steps to reach goal.", 10000 - sumOfSteps);
        }

    }
}
