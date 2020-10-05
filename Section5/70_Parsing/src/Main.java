public class Main {

    public static void main(String[] args) {
        String numberAsString = "2018";
        String numberAsString2 = "2018.256";
        System.out.println("numberAsString= " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println(number);
        double number2 = Double.parseDouble(numberAsString2);
        System.out.println(number2+3.5);
    }
}
