package be.souk.eau;

public class Eau09 {
    public static void main(String[] args) {
        System.out.println(isNumeric("Bonjour 36"));
    }

    public static boolean isNumeric(String string){
        return string.matches("[0-9]+");
    }
}
