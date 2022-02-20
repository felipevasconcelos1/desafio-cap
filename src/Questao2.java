import java.util.Locale;
import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        String entrada = sc.next();

        Integer contadorUpperCase = 0;
        Integer contadorLowerCase = 0;
        Integer contadorDigit = 0;
        Integer contadorEspeciais = 0;

        Integer contadorFinal = 0;

        for (int i = 0; i < entrada.length(); i ++) {
            if (Character.isUpperCase(entrada.charAt(i))) {
                contadorUpperCase ++;
            }
            if (Character.isLowerCase(entrada.charAt(i))) {
                contadorLowerCase ++;
            }
            if (Character.isDigit(entrada.charAt(i))) {
                contadorDigit ++;
            }
            if (!Character.isLetter(entrada.charAt(i)) && !Character.isDigit(entrada.charAt(i))) {
                contadorEspeciais++;
            }
        }

        if (contadorUpperCase <= 0) {
            contadorFinal += 1;
        }
        if (contadorLowerCase <= 0) {
            contadorFinal += 1;
        }
        if (contadorDigit <= 0) {
            contadorFinal += 1;
        }
        if (contadorEspeciais <= 0) {
            contadorFinal += 1;
        }
        if (entrada.length() + contadorFinal < 6) {
            contadorFinal += (6 - (entrada.length() + contadorFinal));
        }

        System.out.println(contadorFinal);
    }
}