import java.util.Scanner;


public class Questao1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        Integer entrada = Integer.valueOf(x.substring(4));
        String degrau = "";
        int contador = 0;

        for (int i = 0; i < entrada; i++) {

            for (int y = 1; y <= entrada - i; y++) {

                degrau += " ";
                contador++;

            }
            for (int z = entrada - contador; z >= 0; z--) {
                degrau += "*";
            }
            contador = 0;

            System.out.println(degrau.substring(1));
            degrau = "";

        }

    }
}