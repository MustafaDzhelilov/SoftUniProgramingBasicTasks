import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String comand = scan.nextLine();

        int sumPrime = 0;
        int sumNonPrime = 0;
        while (!comand.equals("stop")) {
            int number = Integer.parseInt(comand);
            if (number < 0) {
                System.out.println("Number is negative.");
                comand = scan.nextLine();
                continue;
            }
            int count = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }

            }
            if(count==2){
                sumPrime+=number;
            }else {
                sumNonPrime+=number;
            }

            comand = scan.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d%n", sumNonPrime);
    }
}
