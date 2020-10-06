public class SharedDigit {

    public static boolean hasSharedDigit(int number1, int number2) {

        if(number1<=10||number2<=10||number1>99||number2>99) {
            return false;
        }
        int firstnumber1;
        int firstnumber2;
        int lastnumber1;
        int lastnumber2;

        System.out.println(firstnumber1 = number1/10);
        System.out.println(firstnumber2 = number2/10);
        System.out.println(lastnumber1 = number1%10);
        System.out.println(lastnumber2 = number2%10);

        if((firstnumber1==lastnumber2)||(firstnumber1==firstnumber2)||
                (lastnumber1==lastnumber2)||(lastnumber1==firstnumber2)){
            return true;
        }
        return false;


    }

}
