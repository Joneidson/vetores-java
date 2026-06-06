import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar ? ");
        int qtd = sc.nextInt();

        double [] vect = new double[qtd];

        for (int i = 0; i < vect.length; i++ ){
            System.out.println("Digite os valor: ");
            vect[i] = sc.nextDouble();
        }
        System.out.print("Valores : ");
        for ( double num : vect){
            System.out.print(num + " ");
        }

        double soma = 0.0;
        for ( double num : vect){
            soma += num;
        }
        double media = soma / qtd;
        System.out.println();
        System.out.printf("SOMA = %.2f%n", soma);
        System.out.printf("MEDIA = %.2f%n", media);

        sc.close();
    }
}