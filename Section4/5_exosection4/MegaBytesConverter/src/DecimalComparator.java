public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
        return ((int)(number1*1000)) == ((int)(number2*1000));
    }
}
