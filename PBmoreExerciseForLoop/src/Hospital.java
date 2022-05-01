import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int period = Integer.parseInt(scan.nextLine());

        int sumOfCheckedPatient = 0;
        int sumOfDont = 0;
        int sumOfPatient = 0;
        int count = 0;
        int doctors = 7;

        for(int i =1; i<=period; i++) {
            int brPatient = Integer.parseInt(scan.nextLine());
            sumOfPatient+=brPatient;
            count++;
            if (count % 3 == 0){
                if (sumOfDont > sumOfCheckedPatient) {
                    doctors += 1;
                }
        }
            if(brPatient < doctors){
                sumOfCheckedPatient = sumOfCheckedPatient+brPatient;
            }else{
                sumOfCheckedPatient +=doctors;
            }
            sumOfDont = sumOfPatient - sumOfCheckedPatient;


            }
        System.out.println("Treated patients: "+sumOfCheckedPatient+".");
        System.out.println("Untreated patients: "+ sumOfDont+".");
        }

    }

