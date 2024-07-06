package be.souk.terre;

public class Terre09 {
    public static void main(String[] args) {
        System.out.println(pow(2,3));
    }

    public static int pow(int number, double exp) {
        try {
            if(exp<0)
                return 0;
            if(exp == 0)
                return 1;

            return number * pow(number, exp-1);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        return 0;

    }
}
