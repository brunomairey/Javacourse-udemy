public class EventDigitSum {
    public static int getEvenDigitSum(int number) {
        int sum=0;
        int reste=0;
        if (number<0){
            return -1;
        }

        //125 -> 125/10 = 12 -> 12*10 = 120 -> 125-120 = 5
        while (number != 0) {
            // extract the lest-significant digit
            reste = number % 10;
            System.out.println("number is " +number + " and reste is " + reste) ;
            if(reste%2 ==0){
                sum += reste;
            }

            number /= 10; // same as number = number/10;
            System.out.println("number after dividing by ten is " + number);
        }
        return sum;
    }
}
