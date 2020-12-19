import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,5,3,7,11,9,2};
        System.out.println("array = " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reverse array" + Arrays.toString(array));
    }

    private static void reverse(int[] array) {

       int maxIndex = array.length -1;
        int halfLength = array.length / 2;
        System.out.println(maxIndex + "  " + halfLength);
        for (int i=0;i<halfLength;i++){
            int temp = array[i];
            System.out.println("temp is " + temp);
            array[i] = array[maxIndex-i];
            System.out.println("aaray i is " + array[i]);
            array[maxIndex-i] = temp;
            System.out.println("new temp is " + temp);
        }
    }
}
