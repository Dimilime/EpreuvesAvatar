package be.souk.eau;

import be.souk.terre.Terre11;

public class Eau05 {
    public static void main(String[] args) {

        System.out.println(findFirstPrimeAfter(19));
    }

    public static int findFirstPrimeAfter(int nb){

        if (nb < 0) return 0;

        while (true){
            nb++;
            if(Terre11.isPrimeNumber(nb)){
                return nb;
            }
        }
    }
}
