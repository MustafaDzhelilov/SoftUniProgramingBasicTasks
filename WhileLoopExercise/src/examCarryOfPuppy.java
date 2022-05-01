import java.util.Scanner;

public class examCarryOfPuppy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int food = Integer.parseInt(scan.nextLine());
        int grOfFood = food * 1000;
        String input = scan.nextLine();

        int sumOfGr = 0;

        while(!input.equals("Adopted")){
            int gr = Integer.parseInt(input);
                sumOfGr+=gr;

                input = scan.nextLine();
        }
        if("Adopted".equals(input)){
            if(grOfFood >=sumOfGr){
                int leftFood = grOfFood - sumOfGr;
                System.out.printf("Food is enough! Leftovers: %d grams.",leftFood);
            }else {
                int needFood = sumOfGr - grOfFood;
                System.out.printf("Food is not enough. You need %d grams more.", needFood);
            }
        }
    }
}
