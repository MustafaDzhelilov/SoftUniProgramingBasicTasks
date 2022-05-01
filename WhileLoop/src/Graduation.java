import java.util.Scanner;
public class Graduation {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        String name = scan.nextLine();
        double avarage = 0;
        int clas = 1;
        int repetitions =0;
        boolean isExcluded = false;

        while(clas <=12){
            double ocenka = Double.parseDouble(scan.nextLine());
            if(ocenka <4){
                repetitions++;
                if(repetitions==2){
                    System.out.printf("%s has been excluded at %d grade",name,clas);
                    isExcluded = true;
                    break;
                }
                continue;
            }
            avarage+=ocenka;
            clas++;
        }
        if(!isExcluded) {
            double sum = avarage / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, sum);
        }
    }
}
