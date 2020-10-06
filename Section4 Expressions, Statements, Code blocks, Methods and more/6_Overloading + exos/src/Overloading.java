public class Overloading {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || (inches < 0 || inches > 12)) {
            System.out.println("Invalid foot or Inches");
            return -1;
        }
        double centimeters= (feet*12 + inches)*2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0) {
            System.out.println("Invalid inches");
            return -1;
        }
        else {
            double feet = (int) inches/12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
    }
}
