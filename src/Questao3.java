import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class Questao3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String palavra = sc.next();

        HashMap<String, Integer> cond = new HashMap<>();
        AtomicReference<Integer> qtd = new AtomicReference<>(0);
        Integer size = palavra.length();

        for(int x=0; x<=size; x++) {
            for(int y=x+1; y<=size; y++) {
                char[] palavraS = palavra.substring(x, y).toCharArray();
                Arrays.sort(palavraS);
                String palavras2 = new String(palavraS);
                if (cond.containsKey(palavras2))
                    cond.put(palavras2, cond.get(palavras2)+1);
                else
                    cond.put(palavras2, 1);
            }
        }

        cond.forEach((x,y) -> {
            if (y > 1)
                qtd.set(qtd.get() + 1);
        });

        System.out.println(qtd);
    }
}