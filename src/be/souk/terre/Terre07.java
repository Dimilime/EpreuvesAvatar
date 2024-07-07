package be.souk.terre;

public class Terre07 {
    public static void main(String[] args) {
        System.out.println(reverseString("michel a du miel!"));
    }

    public static String reverseString(String string){

        if(!string.matches("^[A-Za-z!,;. ]+$") || string.length() > 500)
            return "Erreur";

        String [] chars = string.split("");

        StringBuilder charsReversed = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            charsReversed.append(chars[chars.length - 1 - i]);
        }

        return charsReversed.toString();

    }
}
