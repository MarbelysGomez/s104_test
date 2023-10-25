package S104_N1exercise2;

public class DniCalculation {
    private static final String dniLetters = "TRWAGMYFPDXBNJZSQVHLCKE";

    public static char calculateLetter(int dni){
        return dniLetters.charAt(dni % 23);
    }
}
