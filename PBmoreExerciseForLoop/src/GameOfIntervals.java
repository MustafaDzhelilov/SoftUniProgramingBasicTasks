import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double n = Double.parseDouble(scan.nextLine());
        int count1 =0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        double sumOfPoints = 0;


        for(int i=1; i<=n; i++){
            double numbers = Double.parseDouble(scan.nextLine());

            if(numbers >=0 && numbers <=9){
                count1++;
                sumOfPoints =sumOfPoints+(numbers * 0.20);
            }
            if(numbers >=10 && numbers <=19){
                count2++;
                sumOfPoints = sumOfPoints+(numbers * 0.30);
            }
            if(numbers >=20 && numbers <=29){
                count3++;
                sumOfPoints = sumOfPoints+(numbers * 0.40);
            }
            if(numbers >=30 && numbers <=39){
                count4++;
                sumOfPoints+=50;
            }
            if(numbers >=40 &&numbers <=50){
                count5++;
                sumOfPoints+=100;
            }
            if(numbers <0 ){
                count6++;
                sumOfPoints =sumOfPoints/2;
            }
            if(numbers >50){
                count6++;
                sumOfPoints = sumOfPoints/2;
            }
        }
        double one = count1 / n*100;
        double two = count2 /n*100;
        double three = count3 /n*100;
        double four = count4 /n*100;
        double five = count5 /n*100;
        double six = count6/n*100;

        System.out.printf("%.2f%n",sumOfPoints);
        System.out.printf("From 0 to 9: %.2f%%%n",one);
        System.out.printf("From 10 to 19: %.2f%%%n",two);
        System.out.printf("From 20 to 29: %.2f%%%n",three);
        System.out.printf("From 30 to 39: %.2f%%%n",four);
        System.out.printf("From 40 to 50: %.2f%%%n",five);
        System.out.printf("Invalid numbers: %.2f%%%n",six);

    }
}
