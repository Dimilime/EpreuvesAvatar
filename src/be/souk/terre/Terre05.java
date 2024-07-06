package be.souk.terre;

public class Terre05 {

    public static void main(String[] args) {
        System.out.println(evenOrOdd("-98"));
    }

    public static String evenOrOdd(String number){
        if(number.isEmpty() || !number.matches("-?\\d+"))
            return "Tu ne me la mettras pas à l’envers.";

        int num = Integer.parseInt(number);
        return num % 2 == 0 ? "pair" : "impair";
    }
}
