import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Quantos Numeos serão inseridos? ");
        int qtd = sc.nextInt();

        int[] vetor = new int[qtd];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o numero: ");
            vetor[i] = sc.nextInt();
        }


        /*
        System.out.println("N° negativos!! ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                System.out.println(vetor[i]);
            }
        }
        System.out.println("N° Positivos!! ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > 0) {
                System.out.println(vetor[i]);
            }
        }
        */

        // versao for(each)  mais simples quando nao preciso usa o index como regra de controle
        System.out.println("N° negativos!! ");
        for (int num : vetor) {
            if (num < 0) {
                System.out.println(num);
            }
        }

        System.out.println("N° Positivos!! ");
        for (int num : vetor) {
            if (num > 0) {
                System.out.println(num);
            }
        }
        sc.close();
    }
}