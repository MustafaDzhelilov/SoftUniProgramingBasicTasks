import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());
        int third = Integer.parseInt(scan.nextLine());
        int count = 0;

        for (int i = 1; i < first; i++) {
            if (i % 2 == 0) {
            }else{
                continue;
            }
            for (int j = 1; j <second ; j++) {
               ///tuka ostana
                for (int k = 1; k <third ; k++) {
                    if (k % 2 == 0) {
                        System.out.printf("%d %d %d%n ",i,j,k);
                    }
                }
            }
        }
    }
}
