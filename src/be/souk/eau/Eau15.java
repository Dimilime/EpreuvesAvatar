package be.souk.eau;

import java.util.Arrays;
import java.util.stream.Stream;

public class Eau15 {
    public static void main(String[] args) {
        String string = "voler voiture marche mari";
        String[] arguments = string.split("\\s");
        Arrays.stream(my_buble_sort_str(arguments) ).forEach(System.out::println);
        System.out.println("****** WITH API STREAM ******");
        sortWithStream(arguments).forEach(System.out::println);
    }

    public static Stream<String> sortWithStream(String [] array){
        return Arrays.stream(array).sorted(String::compareTo);
    }
    public static String [] my_buble_sort_str(String [] array){

        for (int i = array.length-1; i > 0; i--) {
            boolean arraySorted = true;
            for (int j = 0; j < i; j++) {

                if(array[j+1].compareTo(array[j]) < 0 ){
                    String temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    arraySorted = false;
                }
            }

            if (arraySorted) break;
        }

        return array;
    }
}
