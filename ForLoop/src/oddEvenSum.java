import java.util.Scanner;

public class oddEvenSum {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = Integer.parseInt(scan.nextLine());
            int even = 0;
            int odd = 0;

            for(int i =1; i<=n; i++) {
                int number = Integer.parseInt(scan.nextLine());
                if (i % 2 == 0) {
                    even += number;
                } else {
                    odd += number;
                }
            }
            if (even == odd) {
                System.out.println("Yes");
                System.out.println("Sum = " + even);
            } else {
                int dif = Math.abs(even - odd);
                System.out.println("No");
                System.out.println("Diff = " + dif);
            }


        }

    }


