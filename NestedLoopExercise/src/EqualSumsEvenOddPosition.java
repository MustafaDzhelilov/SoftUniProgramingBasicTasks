import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int n1 = Integer.parseInt(scan.nextLine());

        int first = 0;
        int second = 0;
        int third = 0;
        int forth = 0;
        int fifth = 0;
        int sixth = 0;

        for(int start =n; start<=n1; start++){

            first = start%10;
            second = start/10%10;
            third = start/100%10;
            forth = start/1000%10;
            fifth = start /10000%10;
            sixth = start/100000;

            if(second+forth+sixth ==fifth+third+first){
                System.out.printf("%d ",start);
            }


        }

    }

}
