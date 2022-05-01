import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int extractFirstDay = Integer.parseInt(sc.nextLine());
        int count = 0;
        int sum = 0;
        while (extractFirstDay >= 100) {
            count++;
            int currentSum = (extractFirstDay - 26);
            extractFirstDay = extractFirstDay - 10;
            sum +=currentSum;
            if(extractFirstDay < 100){
                sum = sum - 26;
            }
        }

        System.out.println(count);
        System.out.println(sum);
    }
}
