import java.util.Scanner;

public class kvartalShop {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            String product = scan.nextLine();
            String city = scan.nextLine();
            double quantity = Double.parseDouble(scan.nextLine());

            double price = 0;


            if(city.equals("Sofia")){

                if(product.equals("coffee")){
                    price = 0.50;
                }
                if(product.equals("water")){
                    price = 0.80;
                }
                if(product.equals("beer")){
                    price = 1.20;
                }
                if(product.equals("sweets")){
                    price = 1.45;
                }
                if(product.equals("peanuts")){
                    price = 1.60;
                }

            }

            if(city.equals("Plovdiv")){

                if(product.equals("coffee")){
                    price = 0.40;
                }
                if(product.equals("water")){
                    price = 0.70;
                }
                if(product.equals("beer")){
                    price = 1.15;
                }
                if(product.equals("sweets")){
                    price = 1.30;
                }
                if(product.equals("peanuts")){
                    price = 1.50;
                }

            }

            if(city.equals("Varna")){

                if(product.equals("coffee")){
                    price = 0.45;
                }
                if(product.equals("water")){
                    price = 0.70;
                }
                if(product.equals("beer")){
                    price = 1.10;
                }
                if(product.equals("sweets")){
                    price = 1.35;
                }
                if(product.equals("peanuts")){
                    price = 1.55;
                }

            }
            double result = price * quantity;

            System.out.println(result);






        }
    }









