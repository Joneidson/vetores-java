import java.util.Locale;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas medidas de alturas vc vai querer: ");
        int quantidadeAlturas = sc.nextInt();

        double somaAlturas = 0.0;
        double[] vetorAltura = new double [quantidadeAlturas];// aqui double pode ler in pois ele ja faz a conversao direta de double << int
        System.out.println("Digite o valor das altura? ");
        for (int i = 0; i < quantidadeAlturas; i++) {
            vetorAltura[i] = sc.nextDouble(); // ratiocination = toda vez que o for rodar ele vai fazer o escane jogar dentro do vetor o valor na posição recebeida
            somaAlturas += vetorAltura[i];
        }

        System.out.println("Os valores são: ");
        for (int i = 0; i < quantidadeAlturas; i++) {
           System.out.println(vetorAltura[i]);
        }
        System.out.println("Total da soma: " + somaAlturas);
        double mediaAlturas = somaAlturas / quantidadeAlturas;
        System.out.printf("Media das alturas: %.2f%n", mediaAlturas);
    }
}