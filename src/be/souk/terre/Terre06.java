package be.souk.terre;

public class Terre06 {
    public static void main(String[] args) {
        System.out.println(divOf(5,5)); ;
    }

    public static String divOf(int numerator, int denominator){
        if(denominator == 0 || Math.abs(denominator)  > Math.abs(numerator)){
            return "Erreur";
        }

        return String.format("""
                résultat : %d
                reste: %d
                """,numerator/denominator, numerator%denominator) ;
    }
}
