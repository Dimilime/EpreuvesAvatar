package be.souk.eau;

import java.util.Arrays;

public class Eau14 {
    public static void main(String[] args) {
        Arrays.stream(my_select_sort(new int[] {1,2,4,8,9,3,7,6,5}) ).forEach(System.out::println);
    }

    public static int [] my_select_sort(int [] tab){


        for (int i = 0; i < tab.length - 1; i++) {//-1 car on compare avec l'élement suivant, évite l'exception out of bound
            int min = i;
            for (int j = i+1; j < tab.length; j++) {
                if(tab[j] < tab[min])
                    min = j;
            }

            if(min != i){
                int temp = tab[i];
                tab[i] = tab[min];
                tab[min] = temp;
            }
        }

        return tab;
    }


}
