package be.souk.terre;

public class Terre11 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(isPrimeNumber(i) ? i+" est premier" : i+" n'est pas premier"); ;
        }
    }

    public static boolean isPrimeNumber(int number){
        /*
        * Les premiers algorithmes pour décider si un nombre est premier (appelés tests de primalité)
        * consistent à essayer de le diviser par tous les nombres qui n'excèdent pas sa racine carrée :
        * s'il est divisible par l'un d'entre eux, il est composé, et sinon, il est premier. (wikipedia) */

        if (number < 2) {
            return false;
        }

        // Vérifie les diviseurs potentiels de 2 à la racine carrée du nombre
        for (int i = 2; i * i <= number; i++) { // suggestion de chatGPT plus performant de multiplié que de faire la racine carré
            if (number % i == 0) {              // formule:  i <= ²V number (i représente tout les nombre qui n'excèdent pas sa racine carrée)
                return false;                   // on passe la racine de l'autre coté de l'inéquation elle devient i² <= number
            }
        }

        // Si aucun diviseur n'a été trouvé, le nombre est premier
        return true;
    }
}
