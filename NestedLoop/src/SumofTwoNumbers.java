import java.util.Scanner;

public class SumofTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int start = Integer.parseInt(scan.nextLine());
        int to = Integer.parseInt(scan.nextLine());
        int magic = Integer.parseInt(scan.nextLine());
        int count =0;
        boolean isFound = false;

        for(int i = start; i<=to; i++){
           for(int j =start; j<=to; j++){
               count++;
                if(i + j ==magic){
                    System.out.printf("Combination N:%d (%d + %d = %d)",count,i,j,magic);
                    isFound =true;
                    break;
                }
            }
            if(isFound){
               break;
            }
        }
        if(!isFound) {
            System.out.printf("%d combinations - neither equals %d", count, magic);
        }
    }
}
