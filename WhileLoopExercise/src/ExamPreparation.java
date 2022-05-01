import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countOfMarke = Integer.parseInt(scan.nextLine());

        String currentTask = " ";
        double gradeSum = 0;
        int solvedProblems = 0;
        int count = 0;
        boolean a = true;

        while(count < countOfMarke) {
            String nameOfTask = scan.nextLine();
            if("Enough".equals(nameOfTask)){
                a=false;
                break;
            }
            int evaluation = Integer.parseInt(scan.nextLine());
            if(evaluation <=4){
                count++;
            }
            gradeSum+=evaluation;
            solvedProblems++;
            currentTask = nameOfTask;
        }
        if(a){
            System.out.printf("You need a break, %d poor grades.", count);
        }else{
            System.out.printf("Average score: %.2f%n",gradeSum/solvedProblems);
            System.out.printf("Number of problems: %d%n",solvedProblems);
            System.out.printf("Last problem: %s", currentTask);

        }

    }
}
