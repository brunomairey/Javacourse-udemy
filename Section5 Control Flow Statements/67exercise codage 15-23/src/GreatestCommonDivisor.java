public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if(first<10||second<10) {
            return -1;
        }
        int pgcd=0;
        for (int i = 1; i <= first; i++) {
            if (first % i == 0 && second%i==0) {
                System.out.println(pgcd=i);
            }
        }

        return pgcd;
    }
}
