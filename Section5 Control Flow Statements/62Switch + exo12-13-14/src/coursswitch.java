public class coursswitch {
    public static void valueexo(int switchValue) {

            switch(switchValue)

    {
        case 1:
            System.out.println("Value was 1");
            break;

        case 2:
            System.out.println("Value was 2");
            break;

        default:
            System.out.println("was not 1 or 2");
            break;
    }

    char charValue = 'h';
        switch(charValue)

    {
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
            System.out.println("was a a or b or c or d or e");
            System.out.println("Actually it was an " + charValue);
            break;
        default:
            System.out.println("It was none of them");
            break;
    }
}
}
