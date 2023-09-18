import java.io.IOException;
import java.util.Random;

public class Testes {
    public static void main(String[] args) {
        Random random = new Random();
        try {

            int letra = random.nextInt(90 - 65 + 1) + 65; // Letra premiada, pode ser alterada
            char letraPremiada = (char) Character.toUpperCase(letra);
            System.out.println("Letra Premiadaaaaa e: " + letraPremiada);

            System.out.println("Aposte uma letra de A a Z: ");
            int entrada = System.in.read();
            char letraApostada = (char) Character.toUpperCase(entrada);



            if (Character.isLetter(letraApostada) && letraApostada >= 'A' && letraApostada <= 'Z') {

                System.out.println("Letra premiada: " + letraPremiada);

                if (letraApostada == letraPremiada) {
                    System.out.println("Você ganhou R$ 500,00 reais.");
                } else {
                    System.out.println("Que pena! A letra sorteada foi: " + letraPremiada + ".");
                }
            } else {
                System.out.println("Aposta inválida.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
