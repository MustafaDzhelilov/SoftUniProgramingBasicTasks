import java.util.Scanner;

public class EasterBake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int countKozunak = Integer.parseInt(scan.nextLine());
        int maxSugar=Integer.MIN_VALUE;
        int maxFlour=Integer.MIN_VALUE;
        double zahar = 0;
        double flour = 0;
        double packSugar = 0;
        double packFlour = 0;
        int inum = 0;
        int inum1 =0;


        for (int i = 1; i <=countKozunak ; i++) {
            int sugar = Integer.parseInt(scan.nextLine());
            int brashno = Integer.parseInt(scan.nextLine());
            zahar+=sugar;
            flour+=brashno;

            if(sugar>maxSugar){
                maxSugar=sugar;
            }
            if(brashno>maxFlour){
                maxFlour=brashno;
            }
            packSugar = Math.ceil(zahar/950)*1.0;
            packFlour =Math.ceil(flour/750)*1.0;
             inum = (int)packSugar;
             inum1 = (int)packFlour;
        }
        System.out.printf("Sugar: %s%n",inum);
        System.out.printf("Flour: %s%n",inum1);
        System.out.printf("Max used flour is %s grams, max used sugar is %s grams.",maxFlour,maxSugar);
    }
}
