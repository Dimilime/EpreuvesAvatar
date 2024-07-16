package be.souk.eau;

public class Eau06 {
    public static void main(String[] args) {

        String string = "bonjour";
        String toFind = "jour";

        if(isAlpha(string) && isAlpha(toFind)){
            System.out.println(findStrInStr(string,toFind));
        }else
            System.out.println("Error");
    }

    public static boolean isAlpha(String string){
        return string.matches("^[a-zA-z ]+$");
    }

    //V2
    public  static  boolean findStrInStr(String string, String toFind){
        //Cet expression régulière signifie qu'on cherche "toFind" dans une chaine qui commence et fini par n'importe quelle chaine de caractère
        return string.matches(STR."^.*\{toFind}.*$");//oui sur la v1 j'ai cherché trop loin ^^'
    }

    //V1
    /*public static boolean findStrInStr(String string, String toFind){

        String [] stringArray = string.split("");
        String [] toFindArray = toFind.split("");

        int lengthToFind = toFindArray.length;

        try{
            for (int i = 0; i < stringArray.length; i++) {
                int lengthFounded = 0;
                int j=i;
                if(toFindArray[0].equals(stringArray[i])){
                    for (String s : toFindArray) {
                        if(s.equals(stringArray[j++]))
                            lengthFounded++;

                        if(lengthFounded == lengthToFind)
                            return true;
                    }
                }

            }
        }
        catch (IndexOutOfBoundsException e){
            return false;
        }

        return false;
    }*/
}
