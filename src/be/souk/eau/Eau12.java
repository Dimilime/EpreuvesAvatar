package be.souk.eau;

public class Eau12 {
    public static void main(String[] args) {
        System.out.println(absMinDifference(new int[]{1, 2, 5, -6, -9, 7, 4}));
    }

    public static int absMinDifference(int [] tab){
        if(isArrayEmpty(tab)) {
            System.out.println("Error");
            return -1;
        }

        tab = makeAbsolute(tab);
        tab = sortDesc(tab);

        return tab[0] - tab[1];

    }

    public static int [] makeAbsolute(int [] tab){
        for (int i = 0; i < tab.length; i++) {
            if(tab[i] < 0){
                tab[i] = -tab[i];
            }
        }

        return tab;
    }

    public static boolean isArrayEmpty(int [] tab){
        return tab.length <1;
    }
    public static int [] sortDesc(int [] tab){


        for (int i = 0; i < tab.length; i++) {
            for (int j = i+1; j < tab.length; j++) {
                if(tab[j] > tab[i]){
                    int temp = tab[j];
                    tab[j] = tab[i];
                    tab[i] = temp;
                }
            }
        }

        return tab;
    }
}
