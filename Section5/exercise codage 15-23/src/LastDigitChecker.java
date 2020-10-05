public class LastDigitChecker {

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {

        if(!isValid(number1)||!isValid(number2)||!isValid(number3)) {
            return false;
        }
        int rest1;
       int rest2;
       int rest3;
        rest1 = number1 % 10;
        rest2 = number2 % 10;
        rest3 = number3 % 10;

          if ((rest1 == rest2) || (rest1 == rest3) ||
                    (rest2 == rest3)) {
                return true;
            }

        return false;

    }

    public static boolean isValid (int num) {
        if ((num < 10) || (num > 1000)) {
            return false;
        }
        return true;
    }
}
