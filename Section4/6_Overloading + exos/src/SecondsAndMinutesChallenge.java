public class SecondsAndMinutesChallenge {

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
           return "Invalid Value";
        }
        int hours= minutes/60;
        int restMinutes= minutes%60;
        String hoursString = hours + "h";
        if(hours<10){
            hoursString ="0" +hoursString;
        }
        String minutesString = restMinutes+ "m";
        if(restMinutes<10){
            minutesString ="0" +minutesString;
        }
        String secondsString = seconds + "s";
        if(seconds<10){
            secondsString ="0" +secondsString;
        }
        return hoursString + " " + minutesString + " " + secondsString;
    }

    public static String getDurationString (int seconds) {
        if (seconds < 0) {
           return "Invalid value";
        }
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);


    }

}
