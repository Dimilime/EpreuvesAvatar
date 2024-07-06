package be.souk.terre;

public class Terre10 {

    public static void main(String[] args) {
        System.out.println(SquareRoot(22));
    }

    public static Double SquareRoot(int number){

        if(number < 0){
            System.out.println("Pas de nombre négatif");
            return null;
        }

        return Math.pow(number,0.5);
    }
}
