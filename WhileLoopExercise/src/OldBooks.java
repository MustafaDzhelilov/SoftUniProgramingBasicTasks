import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        String book = scan.nextLine();
        int count = 0;
        boolean isFound = false;
        String knigi = scan.nextLine();

        while(!knigi.equals("No More Books")){
            if(knigi.equals(book)) {
                isFound = true;
                break;
            }
            count++;
            knigi = scan.nextLine();
            }
        if(isFound){
            System.out.printf("You checked %d books and found it.",count);
        }else{
            System.out.printf("The book you search is not here!%nYou checked %d books.",count);
        }
        }
    }

