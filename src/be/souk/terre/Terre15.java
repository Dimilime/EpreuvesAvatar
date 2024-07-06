package be.souk.terre;

import java.util.Arrays;

public class Terre15 {

    public static void main(String[] args) {
        System.out.println(isSorted(new int[] {1,2,3,5,7,6}));
    }

    public static boolean isSorted(int[] integers){

        for (int i = 0; i< integers.length-1; i++){
            for (int j = i+1 ; j < integers.length; j++) {
                if(integers[j] < integers[i])
                {
                    return false;
                }
            }

        }
        return true;

    }



}
