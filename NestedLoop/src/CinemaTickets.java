import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        String filmName = scan.nextLine();
        double studCount=0;
        double standCount=0;
        double kidCount=0;
        int sumOfTickets = 0;
        double sumOfTicketsPerMovie =0;
        String type ="";
        double  procentage = 0;

        while(!filmName.equals("Finish")){
            int freePlace = Integer.parseInt(scan.nextLine());
            for( int i = freePlace; i > 0; i--) {
                type = scan.nextLine();
                if ("End".equals(type)) {
                    break;
                } else if ("Finish".equals(type)) {
                    break;
                } else if ("student".equals(type)) {
                    studCount++;
                } else if ("standard".equals(type)) {
                    standCount++;
                } else if ("kid".equals(type)) {
                    kidCount++;
                }
                sumOfTickets++;
                sumOfTicketsPerMovie++;
            }
            procentage = sumOfTicketsPerMovie / freePlace*100;
            System.out.printf("%s - %.2f%% full.%n",filmName,procentage);
            sumOfTicketsPerMovie=0;

            if(type.equals("Finish")){
                break;
            }else{
                filmName= scan.nextLine();
            }
            }
        double procentageStudents = studCount/sumOfTickets*100;
        double procentageStandart = standCount/sumOfTickets*100;
        double procentageKid = kidCount/sumOfTickets*100;

        System.out.printf("Total tickets: %d%n",sumOfTickets);
        System.out.printf("%.2f%% student tickets.%n",procentageStudents);
        System.out.printf("%.2f%% standard tickets. %n",procentageStandart );
        System.out.printf("%.2f%% kids tickets. %n",procentageKid);

        }


    }

