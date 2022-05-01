import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());


        double count = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 =0;
        int sum4 = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for( int i=1; i<=n; i++){
            count++;
            int number1 = Integer.parseInt(scan.nextLine());
            int number2 = Integer.parseInt(scan.nextLine());

            if(count % 1 ==0){
                sum1 = (number1+number2);
            }
            if(count %2==0){
                sum2 = (number1+number2);
            }
            if(count %3==0){
                sum3 = (number1+number2);
            }
            if(count %4==0){
                sum4 = (number1+number2);
            }

        }
    }
}
