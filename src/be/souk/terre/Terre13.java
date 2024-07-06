package be.souk.terre;

import java.util.Arrays;

import static be.souk.terre.Terre12.to2Digit;
import static be.souk.terre.Terre12.transform24hourTo12;

public class Terre13 {
    public static void main(String[] args) {
        System.out.println(transform24hourTo12(transform12hourTo24("01:00PM")) );
    }
    public static String transform12hourTo24(String format12Hour){
        if(format12Hour == null || format12Hour.isBlank()  || !format12Hour.contains(":") || !format12Hour.matches("^(0[1-9]|1[0-2]):[0-5]\\d[APap][mM]$") )
            return "Erreur, entrez une heure au format 12h terminant par AM ou PM";
        String[] time = format12Hour.substring(0,format12Hour.length()-2).split(":");

        String amOrPm = format12Hour.substring(5).toUpperCase();
        int hour = Integer.parseInt(time[0]);
        int minutes = Integer.parseInt(time[1]);

        if(amOrPm.equals("AM") && hour == 12) {
            hour = 0;
        }
        else if(amOrPm.equals("PM") && hour < 12){
            hour +=12;
        }

        return to2Digit(hour)+":"+to2Digit(minutes);
    }
}
