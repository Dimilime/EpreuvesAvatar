package be.souk.eau;

public class Eau07 {
    public static void main(String[] args) {
        System.out.println(toUpperCaseOneOfTwo("Hello world"));
    }

    public static String toUpperCaseOneOfTwo(String string){

        if(!Eau06.isAlpha(string)) return "Error";

        String [] stringArray = string.split("");
        boolean oneOfTwo = true;
        for (int i = 0; i < stringArray.length; i++) {
            if(oneOfTwo){
                stringArray[i] = stringArray[i].toUpperCase();
            }

            if(!stringArray[i].equals(" "))
                oneOfTwo = !oneOfTwo;
        }

        return String.join("", stringArray);
    }
}
