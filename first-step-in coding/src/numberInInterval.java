import java.util.Scanner;

public class numberInInterval {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            double number = Double.parseDouble(scan.nextLine());

            if(number >= -100 && number <= 100 && number !=0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }








        }
    }








