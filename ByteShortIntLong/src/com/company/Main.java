package com.company;

public class Main {

    public static void main(String[] args) {
//        int myValue = 10_000;
//        int myMinIntValue = Integer.MIN_VALUE;
//        int myMaxIntValue = Integer.MAX_VALUE;
//        System.out.println(myMinIntValue);
//        System.out.println(myMaxIntValue);
//        System.out.println(myValue);
//	// write your code here
//        byte myMinByteValue = Byte.MIN_VALUE;
//        byte myMaxByteValue = Byte.MAX_VALUE;
//        System.out.println(myMinByteValue);
//        System.out.println(myMaxByteValue);
//
//        short myMinShortValue = Short.MIN_VALUE;
//        short myMaxShortValue = Short.MAX_VALUE;
//        System.out.println(myMinShortValue);
//        System.out.println(myMaxShortValue);
//
//        long myLongValue = 100L;
//        long myMinLongValue = Long.MIN_VALUE;
//        long myMaxLongValue = Long.MAX_VALUE;
//        System.out.println(myMinLongValue);
//        System.out.println(myMaxLongValue);
//
//        byte myNewByteValue = (byte)(myMaxByteValue/2);
//        System.out.println("tha value is" + myNewByteValue);

//        byte byteValue = 10;
//        short shortValue = 20;
//        int intValue =400;
//        long longValue = (long) 50000 + 10*(byteValue + shortValue + intValue);
//        System.out.println("longvalue is " + longValue);
    /*    int myIntValue =5/3;
        float myFloatValue = 5f /3;
        double myDoubleValue = 5/3d;
        System.out.println("myIntValue is " + myIntValue );
        System.out.println("myFloatValue is " + myFloatValue);
        System.out.println("myDoubleValue is " + myDoubleValue);
        double numberOfPounds = 3.258d;
        double numberOfKilograms = numberOfPounds*0.45359237d;
        System.out.println(numberOfPounds + " are equivalent to " + numberOfKilograms);*/

        char myCopyright = '\u00A9';
        //https://unicode-table.com/fr/
        System.out.println(myCopyright);

        boolean isCustomerOverTwentyOne = true;

        int result = 1 + 2;
        int previousResult = result;
        result = result - 1;
        System.out.println("the result is " + result);
        result = result * 10;
        System.out.println("the result is " + result);
        result++;
        //result = result + 1
        result = result + 2;
        result += 2;
        System.out.println(result);
        result *= 10;
        System.out.println(result);

        boolean isAlien = true;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
        } else {
            System.out.println("This is indeed an alien !");
        }

        int ScorePlayer1 = 80;
        int ScorePlayer2 = 60;
        if ((ScorePlayer1 > ScorePlayer2) && (ScorePlayer1<100)) {
            System.out.println("The Score of player 1 is grater than the score of player2 and less than 100 ");
        }else {System.out.println("The Score is less than 100");}
        boolean isCar = false;
        if(!isCar) {
            System.out.println("This is not supposed to be true");
        }

        int ageOfClient = 15;
        boolean isEighteenOrOver = ageOfClient == 20 ? true:false;
        System.out.println(isEighteenOrOver);

        double doubleValue =20.00d;
        System.out.println(doubleValue);
        double doubleValue2 = 80d;
        double firstResult = (doubleValue + doubleValue2 ) * 100.00d;
        double reminder = firstResult % 40d;
        System.out.println(reminder);
        boolean modulusEqual0 = (reminder == 0) ? true:false;
        System.out.println(modulusEqual0);
        if (!modulusEqual0) {
            System.out.println("Got some reminder");}
        else{
            System.out.println("The reminder is 0");
        }
    }
}
// != is not equal to == is equal to || or && and
