import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        String password = scan.nextLine();

       String currentPassword = scan.nextLine();

        while(!currentPassword.equals(password)){
            currentPassword = scan.nextLine();
        }
        System.out.println("Welcome "+name+"!");
    }
}
