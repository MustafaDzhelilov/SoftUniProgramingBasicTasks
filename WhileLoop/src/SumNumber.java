import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int sum=0;

        while(sum <number){
            int currentNumber = Integer.parseInt(scan.nextLine());
             sum +=currentNumber;
        }
        System.out.println(sum);
    }
}
