public class MultiplicationTable {
    public static void main(String[] args) {


        for(int i =1; i<=10; i++){
            for(int a =1; a<=10; a++){
                int product = i*a;
                System.out.printf("%d * %d = %d%n",i,a,product);
            }
        }
    }
}
