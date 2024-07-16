package be.souk.eau;

public class Eau11 {
    public static void main(String[] args) {
        System.out.println(findFirstIndex("test test test", "test"));
    }

    public static int findFirstIndex(String string, String toFind){
        String [] arrayString = string.split("\\s");

        for (int i = 0; i < arrayString.length; i++) {
            if (arrayString[i].equals(toFind))
                return i;
        }

        return -1;
    }
}
