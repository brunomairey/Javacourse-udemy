import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;
        anotherArray[0] = 1;

        System.out.println("myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("anotherArray= " + Arrays.toString(anotherArray));

        anotherArray = new int[]{4,5,6,7,8};
        modifyArray(myIntArray);

        System.out.println("myIntArray modify= " + Arrays.toString(myIntArray));
        System.out.println("anotherArray modify = " + Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array){
        array[0]=2;
        array = new int[]
                {1,2,3,4,5};
    }
}
