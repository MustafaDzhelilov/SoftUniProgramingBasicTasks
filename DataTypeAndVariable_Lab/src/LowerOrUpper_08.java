import java.util.Scanner;

public class LowerOrUpper_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char chr = sc.next().charAt(0);
        int asciiValue = chr;
        if(asciiValue >= 65 && asciiValue <=90){
            System.out.println("upper-case");
        }else if(asciiValue >= 97 && asciiValue <= 122){
            System.out.println("lower-case");
        }
    }
}
