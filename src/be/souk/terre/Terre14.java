package be.souk.terre;

import java.sql.SQLOutput;

public class Terre14 {
    public static void main(String[] args) {
        System.out.println(STR."The midlle value of three of them is :\{midValue(4, 10, 6)}");
    }
    public static String midValue(int nb1, int nb2, int nb3){
        if (nb1 == nb2 && nb1 == nb3){
            return "Erreur";
        }
        int [] values = {nb1,nb2,nb3};
        int temp = 0;
        for (int i = 1; i < values.length; i++) {
            if(values[i] < values[i-1] ){
                temp = values[i];
                values[i] = values[i-1];
                values[i-1] = temp;
            }
        }

        return String.valueOf(values[1]) ;
    }
}




