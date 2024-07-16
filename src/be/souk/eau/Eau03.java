package be.souk.eau;

public class Eau03 {
    public static void main(String[] args) {
        Eau01.printArray(reverseArray());
    }

    public static String [] reverseArray(String... array){
        if(array.length < 1) return new String[]{ "Error"};

        for (String string : array) {//check whitespace
            if (string.isBlank()) return new String[]{"Error"};
        }

        for (int i = 0; i < array.length/2; i++) {
            String temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }

        return array;
    }
}
