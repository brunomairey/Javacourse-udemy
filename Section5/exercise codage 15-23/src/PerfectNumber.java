public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        if(number<1) {
           return false;
        }
        int factor=0;
        int sum=0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(factor=i);
                sum += factor;
                if (sum==number) {
                    return true; }
            }

        }

        return false;

    }

}
