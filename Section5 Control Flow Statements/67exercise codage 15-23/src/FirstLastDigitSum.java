public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if(number<0){
            return -1;
        }
        int first = 0;
        int last = 0;
        int sum =0;
        System.out.println(last = number % 10);
        while (number > 9) {
           number /= 10;

        }
        System.out.println(first = number);
        sum = first+last;
        return sum;

    }
}
