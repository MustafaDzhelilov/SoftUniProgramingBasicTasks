import java.util.Scanner;

public class characterSequence {

        public static void main(String[] args) {
            Scanner scan =new Scanner(System.in);
            String tekst = scan.nextLine();

            for(int i =0; i<tekst.length(); i++){
                System.out.println(tekst.charAt(i));
            }
        }

    }


