import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

                String input = scan.nextLine();
                int max = Integer.MIN_VALUE;

                while(!input.equals("Stop")){
                    int number = Integer.parseInt(input);
                    if(number > max){
                        max=number;
                    }
                    input= scan.nextLine();
                }
                System.out.println(max);
            }
        }



