import java.text.DecimalFormat;
import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat dF = new DecimalFormat("0.00");

        int n = Integer.parseInt(scan.nextLine());
        int salary = Integer.parseInt(scan.nextLine());

        for(int i =1; i<=n; i++){
            String website = scan.nextLine();

            if(website.equals("Facebook")){
                salary-=150;
            }
            if(website.equals("Instagram")){
                salary-=100;
            }
            if(website.equals("Reddit")){
                salary-=50;
            }else{
                salary-=0;
            }
        }
        if(salary <=0){
            System.out.println("You have lost your salary." );
        }else{
            System.out.println(salary);
        }

    }
}
