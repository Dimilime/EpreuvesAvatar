package be.souk.eau;

import java.util.Arrays;

public class Eau13 {
    public static void main(String[] args) {
        Arrays.stream(my_buble_sort(new int[] {1,2,4,8,9,3,7,6,5}) ).forEach(System.out::println);
    }
    
    public static int [] my_buble_sort(int [] array){

        for (int i = array.length-1; i > 0; i--) {
            boolean arraySorted = true;
            for (int j = 0; j < i; j++) {

                if(array[j+1] < array[j]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    arraySorted = false;
                }
            }

            if (arraySorted) break;//on stop le parcours si le tableau est trié;
        }
        
        return array;
    }
}
