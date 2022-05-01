import java.text.DecimalFormat;
import java.util.Scanner;

public class examTrekkingMania {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat dF = new DecimalFormat("0.00");

        int countOfGroups = Integer.parseInt(scan.nextLine());
        int sumOfPeople = 0;
        double musala= 0;
        double monblan = 0;
        double kilimandjaro = 0;
        double k2 = 0;
        double everest = 0;

        for(int i = 1; i<=countOfGroups; i++){
            int countOfPeopleInTheGroups = Integer.parseInt(scan.nextLine());
            sumOfPeople+=countOfPeopleInTheGroups;
            if(countOfPeopleInTheGroups <=5){
                musala +=countOfPeopleInTheGroups;
            }else if(countOfPeopleInTheGroups <=12){
                monblan += countOfPeopleInTheGroups;
            }else if(countOfPeopleInTheGroups <= 25){
                kilimandjaro += countOfPeopleInTheGroups;
            }else if(countOfPeopleInTheGroups <=40){
                k2 += countOfPeopleInTheGroups;
            }else{
                everest+=countOfPeopleInTheGroups;
            }
        }
        double prMusala = musala / sumOfPeople * 100;
        double prMonblan = monblan /sumOfPeople *100;
        double prKilimandjaro = kilimandjaro/sumOfPeople *100;
        double prK2 = k2/sumOfPeople *100;
        double prEverest = everest/sumOfPeople *100;

        System.out.println(dF.format(prMusala) + "%");
        System.out.println(dF.format(prMonblan) + "%");
        System.out.println(dF.format(prKilimandjaro) + "%");
        System.out.println(dF.format(prK2) + "%");
        System.out.println(dF.format(prEverest) + "%");
    }
}
