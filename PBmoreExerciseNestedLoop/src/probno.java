import java.util.Scanner;

public class probno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double profit = Double.parseDouble(scan.nextLine());
        String nameCocteil = scan.nextLine();

        double sum=0;
        double result = 0;

        while(!nameCocteil.equals("Party!")){
            int countOfCocteil = Integer.parseInt(scan.nextLine());
            sum = nameCocteil.length() *countOfCocteil;
            result+=sum;

            nameCocteil= scan.nextLine();
        }

            if("Party!".equals(nameCocteil)){
                double need = profit-result;
                System.out.printf("We need %.2f leva more.%nClub income - %.2f leva.",need,result);
            }
        if(result>=profit){
            System.out.printf("Target acquired.%nClub income - %.2f leva.",result);
        }

        }
    }

