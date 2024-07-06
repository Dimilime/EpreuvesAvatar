package be.souk.terre;

public class Terre02 {

    public static void main(String[] args) {
        System.out.println(getCurrentFileName());
    }
    private static String getCurrentFileName() {
        // Crée une exception pour obtenir la trace de la pile
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();

        // stackTrace[0] contient la méthode getStackTrace
        // stackTrace[1] contient la méthode getCurrentFileName
        // stackTrace[2] contient la méthode main, donc le fichier actuel
        StackTraceElement element = stackTrace[2];

        // Récupère le nom du fichier
        return element.getFileName();
    }
}
