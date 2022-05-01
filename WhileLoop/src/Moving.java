import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int widthOfSuite = Integer.parseInt(scan.nextLine());
        int lenghtOfSuite = Integer.parseInt(scan.nextLine());
        int heightOfSuite = Integer.parseInt(scan.nextLine());
        int sum = 0;

        String cartons = scan.nextLine();

        while(!cartons.equals("Done")){
            int movingCartons = Integer.parseInt(cartons);
            sum+=movingCartons;
            if(sum >(widthOfSuite*lenghtOfSuite*heightOfSuite)){
                int needSpace = sum-(widthOfSuite*lenghtOfSuite*heightOfSuite);
                System.out.printf("No more free space! You need %d Cubic meters more.",needSpace);
                break;
            }
                cartons = scan.nextLine();
        }
        int totalSpace = widthOfSuite*lenghtOfSuite*heightOfSuite;
        if(totalSpace >sum) {
            int freeSpace = totalSpace-sum;
            System.out.printf("%d Cubic meters left.", freeSpace);
        }
    }
}
