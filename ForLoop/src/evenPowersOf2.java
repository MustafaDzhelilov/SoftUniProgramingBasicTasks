import java.util.Scanner;

public class evenPowersOf2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        for(int i =0; i<=n; i+=2){
            double result =Math.pow(2, i);
            int inum=(int)result;
            System.out.println(inum);
        }

    }

}
