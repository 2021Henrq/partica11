import java.util.ArrayList;
import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        // Coletando 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            numeros.add(sc.nextInt());
        }

        // Calculando soma, média e maior número
        int soma = 0;
        int maior = numeros.get(0);

        for (int num : numeros) {
            soma += num;
            if (num > maior) {
                maior = num;
            }
        }

        double media = (double) soma / numeros.size();

        // Exibindo resultados
        System.out.println("Números digitados: " + numeros);
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Maior número: " + maior);

        sc.close();
    }
}