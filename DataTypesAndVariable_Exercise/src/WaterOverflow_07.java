import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int countLineOfRead = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 1; i <= countLineOfRead; i++) {
            int liters = Integer.parseInt(sc.nextLine());
            if(liters > 255){
                System.out.println("Insufficient capacity!");
                continue;
            }
            sum += liters;
            if(sum > 255){
                System.out.println("Insufficient capacity!");
                sum -=liters;
            }
        }
        System.out.println(sum);
    }
}

