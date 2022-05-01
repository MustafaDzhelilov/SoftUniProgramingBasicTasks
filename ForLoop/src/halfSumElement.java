import java.util.Scanner;

public class halfSumElement {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sumOfn = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 1; i<=n; i++){
            int number = Integer.parseInt(scan.nextLine());
            sumOfn+=number;

            if(number > max){
                max = number;
            }
        }
        int diff = sumOfn - max;

        if(max==diff){
            System.out.println("Yes");
            System.out.println("Sum = "+max);
        }else{
            int result = Math.abs(max - diff);
            System.out.println("No");
            System.out.println("Diff = "+ result);
        }


    }
}
