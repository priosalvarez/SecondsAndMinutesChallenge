public class getDurationString {
    public static String getDurationString(long minutes, long seconds){

        long hours = 0;

        if (minutes < 0 || seconds < 0 ){
            return "Invalid value";
        }
        if (seconds >= 60){
            minutes = seconds / 60 + minutes;
            seconds = seconds % 60;
        }

        hours = minutes / 60;
        minutes = minutes % 60;

        return hours + "h " + minutes + "m " + seconds + "s";
    }

    public static String getDurationString(long seconds){

        long minutes = 0;

        if (seconds < 0 ){
            return "Invalid value";
        }
        if (seconds >= 60){
            minutes = seconds / 60;
            seconds = seconds % 60;
        }

        return minutes + "m " + seconds + "s";
    }
}
