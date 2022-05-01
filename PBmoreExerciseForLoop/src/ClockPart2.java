public class ClockPart2 {

        public static void main(String[] args) {

            int i =0;
            int a = 0;
            int b = 0;

            for(i =0; i<=23; i++){

                for(a =0; a<=59; a++){

                    for(b=0; b<=59; b++){
                        System.out.printf("%d : %d : %d %n",i,a,b);
                    }

                }
            }

        }
    }


