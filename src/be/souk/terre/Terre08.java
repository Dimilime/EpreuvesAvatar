package be.souk.terre;

import java.util.Arrays;

public class Terre08 {
    public static void main(String[] args) {
        System.out.println(stringLength(null));
    }

    public static String stringLength(String str){

        if( str == null || !str.matches("[A-Za-z!,;. ]+") || str.isEmpty()){
            return "Erreur";
        }

        return String.valueOf(Arrays.stream(str.split("")).count()) ;
    }
}
