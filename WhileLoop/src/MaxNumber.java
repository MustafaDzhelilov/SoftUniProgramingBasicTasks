import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int min = Integer.MAX_VALUE;

        while(!input.equals("Stop")){
            int number = Integer.parseInt(input);
            if(number < min){
                min=number;
            }
            input= scan.nextLine();
        }
        System.out.println(min);
    }
}
