package be.souk.terre;

public class Terre03 {
    public static void main(String[] args) {
        printArgs("je ", "suis", "solide", "!");
    }

    public static void printArgs(String... arguments){
        for( String arg : arguments ){
            System.out.println(arg);
        }
    }
}
