package be.souk.eau;

public class Eau10 {
    public static void main(String[] args) {
        printNbBetween(25,20);
    }

    public static void printNbBetween(int min, int max){
        if(min > max ){
            int temp = min;
            min = max;
            max = temp;
        }
        while(min < max){
            System.out.print(STR."\{min} ");
            min++;
        }
    }
}
