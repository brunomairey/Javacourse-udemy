public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0, num= number, dig;

        while (number != 0) {
            // extract the lest-significant digit
            dig = number % 10;
            System.out.println(reverse = dig+(reverse*10));
       //     System.out.println(reverse);
            // drop the least significant digit
            number /= 10; // same as number = number/10;
            if (reverse == num) {
                return true;
            }

        }
        return false;
    }

}
