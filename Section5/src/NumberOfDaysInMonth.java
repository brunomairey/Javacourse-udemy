public class NumberOfDaysInMonth {

        public static boolean isLeapYear(int year) {
            if (year >= 1 && year <= 9999) {
                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        return year % 400 == 0;
                    } else {
                        return true;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        public static int getDaysInMonth(int month, int year) {
            int result;
            if((year < 1) || (year > 9999)){
                result= -1;
            }
            else{
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        result = 31;
                        break;

                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        result = 30;
                        break;

                    case 2:
                        if (isLeapYear(year)) {
                            result = 29;
                        } else {
                            result = 28;
                        }
                        break;
                    default:
                        result = -1;
                        break;

                }
            }
                return result;
        }

}
