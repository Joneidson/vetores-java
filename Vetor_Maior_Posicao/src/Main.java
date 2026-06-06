import entidade.Numero;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos n° será inserido? ");
        int qtd = sc.nextInt();

        Numero [] num = new Numero[qtd];
        for (int i = 0; i < num.length; i++) {
            System.out.println("Digite o valor da posição " + i + " do produto: ");
            double valor = sc.nextDouble();

            num[i] = new Numero (valor, i);
        }

        Numero maior = num[0];
        for (Numero n : num){
            if (n.getValor() > maior.getValor()){
                maior = n;
            }
        }

        System.out.printf("Resultado n° maior: %.2f\nna posição %d", maior.getValor(), maior.getPosicao());

        sc.close();
    }
}