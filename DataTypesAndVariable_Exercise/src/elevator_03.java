import java.util.Scanner;

public class elevator_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countOfPeopleToElevate = Integer.parseInt(sc.nextLine());
        int capacityOfElevator = Integer.parseInt(sc.nextLine());

        int countCourse = (int)Math.ceil((double) countOfPeopleToElevate   / capacityOfElevator);

        System.out.println(countCourse);
    }
}
