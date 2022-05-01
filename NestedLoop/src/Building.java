import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int totalFloor = Integer.parseInt(scan.nextLine());
        int rooms = Integer.parseInt(scan.nextLine());

        for(int floor = totalFloor; floor>=1; floor--){
            for(int j = 0; j<rooms; j++){
                if(floor ==totalFloor){
                    System.out.printf("L%d%d ",floor,j);
                }
                else if(floor % 2 ==0){
                    System.out.printf("O%d%d ",floor,j);
                }else {
                    System.out.printf("A%d%d ", floor, j);
                }
            }
            System.out.println();
        }
    }
}
