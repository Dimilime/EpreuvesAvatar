package be.souk.eau;

public class Eau04 {
    public static void main(String[] args) {
        printIndexOfFibo(3);
    }

    public static void printIndexOfFibo(int index){

        final int N0 = 0;
        final int N1 = 1;

        if(index<0){
            System.out.println("-1");
            return;
        }

        System.out.println(indexOfFibo(index, N0, N1));//N0 et N1 sont les deux premiers nombres de la suite

    }

    public static int indexOfFibo(int index, int a, int b){

        return switch (index) {
            case 0 -> a;
            case 1 -> b;
            default -> indexOfFibo(index - 1, b, a+b);
        };
    }
}
