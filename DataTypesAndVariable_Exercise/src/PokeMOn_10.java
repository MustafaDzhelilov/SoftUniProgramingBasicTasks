import java.util.Scanner;

public class PokeMOn_10 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int m = Integer.parseInt(sc.nextLine());
        int y = Integer.parseInt(sc.nextLine());

        int count = 0;
        double half = n / 2.0;

        while(n >= m){
            count++;
            n -= m;

            if(half == n){
                if(y > 0){
                    n /= y;
                }
            }
        }
        System.out.println(n);
        System.out.println(count);

    }
}
