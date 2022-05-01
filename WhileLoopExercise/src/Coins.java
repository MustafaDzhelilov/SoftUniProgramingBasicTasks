import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double coins = Double.parseDouble(scan.nextLine());

        double coinsInSt = coins *100;

        int count = 0;

        while(coinsInSt >0){

            if(coinsInSt >=200){
                coinsInSt-=200;
                count++;
            }else if(coinsInSt >=100){
                coinsInSt-=100;
                count++;
            }else if(coinsInSt >=50){
                coinsInSt-=50;
                count++;
            }else if(coinsInSt >=20){
                coinsInSt-=20;
                count++;
            }else if(coinsInSt >=10){
                coinsInSt-=10;
                count++;
            }else if(coinsInSt >=5){
                coinsInSt -=5;
                count++;
            }else if(coinsInSt >=2){
                coinsInSt -=2;
                count++;
            }else if(coinsInSt >=1){
                coinsInSt -=1;
                count++;

                }
            }
        System.out.println(count);

        }
    }

