import java.util.Scanner;

public class cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int width = Integer.parseInt(scan.nextLine());
        int lenght = Integer.parseInt(scan.nextLine());
        int cake = width*lenght;
        String input = scan.nextLine();
        int sumOfPiece = 0;
        boolean need = false;

        while(!input.equals("STOP")){
            int piece = Integer.parseInt(input);
            sumOfPiece+=piece;
            if(sumOfPiece >cake){  // !
                need = true;
                break;
            }
          input = scan.nextLine();
        }
        if(need){
            int sum = sumOfPiece - cake;
            System.out.printf("No more cake left! You need %d pieces more.",sum);
        }
        if("STOP".equals(input)){
            int leftCake = cake -sumOfPiece;
            System.out.printf("%d pieces are left.",leftCake);
        }



    }
}
