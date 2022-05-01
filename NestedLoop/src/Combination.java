import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int count = 0;

        for(int i = 0; i<=n; i++){
            for(int a = 0; a<=n; a++){
                for(int b = 0; b<=n; b++){

                    if((i+a+b)==n){
                        count++;
                    }

                }
            }
        }
        System.out.printf("%d",count);
    }
}
