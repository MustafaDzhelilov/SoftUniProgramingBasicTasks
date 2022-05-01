import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countOfStudents = Integer.parseInt(scan.nextLine());

        double countBetween2299 = 0;
        double countBetween3399 = 0;
        double countBetween4499 = 0;
        double countBetween5plus = 0;
        double count = 0;
        double sum =0;

        for(int i = 1; i<=countOfStudents; i++){
            double grades = Double.parseDouble(scan.nextLine());
            count++;
            sum+=grades;
            if(grades >=2 && grades<=2.99){
                countBetween2299+=1;
            }
            if(grades >=3 && grades <=3.99){
                countBetween3399+=1;
            }
            if(grades >=4 && grades <=4.99){
                countBetween4499+=1;
            }
            if(grades >=5){
                countBetween5plus+=1;
            }
        }
        double topStudents = countBetween5plus/count*100;
        double betweenForFive = countBetween4499/count*100;
        double betweenThreeFor = countBetween3399/count*100;
        double betweenTwoThree = countBetween2299/count*100;
        double average = sum/count;

        System.out.printf("Top students: %.2f%%%n",topStudents);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n",betweenForFive);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n",betweenThreeFor);
        System.out.printf("Fail: %.2f%%%n",betweenTwoThree);
        System.out.printf("Average: %.2f%n",average);
    }
}
