package be.souk.eau;

import java.util.*;

public class Eau01 {
    public static void main(String[] args) {
        String [] array3Digit = generateArray3Digit();

        if(isNotEmpty(array3Digit)){
            if(isArrayNumericAnd3Digit(array3Digit)){
                String [] arraySorted = sortStringArray(array3Digit);
                System.out.println("Duplicates string filtered");
                String [] arrayFiltered = filterDuplicatesString(arraySorted);
                printArray(arrayFiltered);
                System.out.println("Duplicates digit filtered");
                printArray(filterDuplicatesDigit(arrayFiltered));
            }
            else
                System.out.println("Array contains not only digit");
        }
        else
            System.out.println("Array is empty ");
    }

    public static boolean isNotEmpty(String [] array){
        return !(array.length < 1);
    }

    public static boolean isArrayNumericAnd3Digit(String [] array){

        return Arrays.stream(array).allMatch( string -> string.matches("^\\d{3}$"));
    }

    public static String [] generateArray3Digit(){
        String [] arr3Digit = new String [1000];
        for (int i = 0; i < 1000; i++) {
            if(i < 10)
                arr3Digit[i] = STR."00\{i}";
            else if(i<100)
                arr3Digit[i] = STR."0\{i}";
            else
                arr3Digit[i] = STR."\{i}";
        }

        return  arr3Digit;
    }

    public static void printArray(String [] array){
        Arrays.stream(array).forEach(System.out::println);
    }

    public static String [] sortStringArray(String[] arrayToSort){
        return Arrays.stream(arrayToSort).map(string -> String.join("",sort(string.split("")))).toArray(String[]::new);
    }

    public static String [] sort(String[] arrayToSort) {

        for (int i = 0; i < arrayToSort.length - 1; i++) {
            for (int j = i + 1 ; j < arrayToSort.length ; j++) {
                if(Integer.parseInt(arrayToSort[j])  < Integer.parseInt(arrayToSort[i]) ){
                    String temp = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[j];
                    arrayToSort[j] = temp;
                }
            }
        }
        return arrayToSort;
    }

    public static String[] filterDuplicatesDigit(String [] arrStr){
        return Arrays.stream(arrStr).filter(
                string -> !containsDuplicates(string.split(""))
        ).toArray(String [] ::new);
    }

    public static String[] filterDuplicatesString(String [] arrStr){
        SortedSet<String> distinct = new TreeSet<>(Arrays.asList(arrStr));
        return distinct.toArray(String [] ::new);
    }

    public static boolean containsDuplicates(String [] arr){
        if(arr.length <1)
            return false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i].equals(arr[j]))
                    return true;
            }
        }

        return false;
    }
}
