import java.util.Scanner;

public class Sequence2k1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int a = 1;
        while (a<=n){
                System.out.println(a);
                a = a * 2 +1;
            }
        }
    }

