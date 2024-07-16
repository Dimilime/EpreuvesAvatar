package be.souk.eau;

public class Eau08 {
    public static void main(String[] args) {
        System.out.println(upperCaseEveryLetterOfWord("bonjour mathilde, comment vas-tu ?!"));
    }

    public static String upperCaseEveryLetterOfWord(String string){

        if(!string.matches("[a-zA-Z?!,;'\\-\\n\\t\\r ]+")) return "Error";

        String [] arrayString = string.split("[ \\t\\r\\n]");// white space or tabulation or new line or carriage return

        for (int i = 0; i < arrayString.length; i++) {
            if(!arrayString[i].equals(" "))
                arrayString[i] = arrayString[i].substring(0,1).toUpperCase() + arrayString[i].substring(1);
        }
        return String.join(" ",arrayString);
    }
}
