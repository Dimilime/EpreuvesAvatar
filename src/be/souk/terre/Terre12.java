package be.souk.terre;

public class Terre12 {
    public static void main(String[] args) {
        System.out.println(transform24hourTo12("12:40"));
    }

    public static String transform24hourTo12(String format24Hour){
        if(format24Hour == null || format24Hour.isBlank()  || !format24Hour.contains(":") || !format24Hour.matches("^(?:[01]\\d|2[0-3]):[0-5]\\d$") )
            return "Erreur, entrez une heure au format 24h";
        String[] time = format24Hour.split(":");

        int hour = Integer.parseInt(time[0]);
        int minutes = Integer.parseInt(time[1]);
        int hourFormat12;

        if(hour == 0){
            hourFormat12 =  12;
        }else if(hour > 12) {
            hourFormat12 = hour -12;
        }else
            hourFormat12 = hour;


        return (hour>=0 && hour <12) ?
                to2Digit(hourFormat12)+":"+to2Digit(minutes)+"AM":
                to2Digit(hourFormat12)+":"+to2Digit(minutes)+"PM";

    }

    public static String to2Digit(int digit){
        return digit < 10 ? "0"+digit : ""+digit;
    }
}
