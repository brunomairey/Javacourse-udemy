public class TeenNumberChecker {

    public static boolean hasTeen(int number1, int number2, int number3) {
        return ((number1 >=13 && number1 <=19)||
                (number2 >=13 && number2<=19) ||
                (number3 >= 13 && number3<=19));
    }

    public static boolean isTeen(int number4) {
        return (number4 >=13  && number4 <=19 );
    }
}
