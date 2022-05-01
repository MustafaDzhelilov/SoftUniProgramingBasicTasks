import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double inheritMoney = Double.parseDouble(scan.nextLine());
        int year = Integer.parseInt(scan.nextLine());

        int count =18;
        double sum =0;

        for(int i =1800; i <=year; i++){
            if(i % 2 ==0) {
                sum += 12000;
            }else{
                int age = (1800 +count)-1800;
                int moneyFromYear = age * 50;
                sum+=12000;
                sum+=moneyFromYear;
            }
            count+=1;
        }
        if(sum > inheritMoney){
            double needMoney = sum -inheritMoney;
            System.out.printf("He will need %.2f dollars to survive.",needMoney);
        }
        if(inheritMoney >= sum){
            double leftMoney = inheritMoney -sum;
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.",leftMoney);
        }
    }
}
