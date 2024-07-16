package be.souk.eau;

import java.util.ArrayList;

public class Eau02 {

    public static void main(String[] args) {
        ArrayList<String> arrayListCombo= generateArrayCombo();
        String [] arrayCombo = new String[arrayListCombo.size()];
        arrayCombo = arrayListCombo.toArray(arrayCombo);

        String [] arrayComboFiltered  = Eau01.filterDuplicatesString(arrayCombo);
        System.out.println("******************************* Après filtrage ***********************************");
        Eau01.printArray(arrayComboFiltered);

    }

    public static ArrayList<String> generateArrayCombo(){

        ArrayList<String> arrayComboOf2Number = new ArrayList<>();

        for (int i = 0; i < 99; i++) {

            for (int j = 0; j <= 99; j++) {
                if( i != j) {// les deux nombres doivent être croissant donc pas égaux
                    String nb1 = STR."\{i}";
                    String nb2 = STR."\{j}";

                    if(i > j){
                        nb1 = STR."\{j}";
                        nb2 = STR."\{i}";
                    }

                    if(i < 10 ){
                        nb1 = STR."0\{nb1}";
                    }

                    if(j < 10){
                        nb2 = STR."0\{nb2}";
                    }



                    arrayComboOf2Number.add(nb1 + nb2);
                }


            }
        }

        return arrayComboOf2Number;

    }
}
