import java.util.Scanner;

public class ContactName_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        String lastName  = sc.nextLine();
         sc.useDelimiter("=>,<->,->,<-");
         String delimeters = sc.nextLine();

        System.out.println(""+firstName+delimeters+lastName);
    }
}
