package be.souk.terre;

public class Terre04 {
    public static void main(String[] args) {
        printAlphabetic('n');
    }
    public static void printAlphabetic(char from){
        for(char i = from; i<='z'; i++){
            System.out.print(i);
        }
        System.out.println();
    }
}
