public class LargestPrime {
    public static int getLargestPrime(int number)

    { if(number <= 1) {
            return -1;
        }

        for(int i = number-1; i>1; i--) {
            if(number % i == 0) {
                number = i;
            }
        }
        return number;
    }






   /* public static int getLargestPrime(int number) {
        if(number<=1) {
            return -1;
        }
        int pgcd=0;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                pgcd=i;
                System.out.println(number = number/i);
                //return pgcd;

            }


        }

return 56;
    }*/

}

