import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String repetir;
        do {

            System.out.print("Quantos n° será inseridos? ");
            int n = sc.nextInt();

            int[] vect = new int[n];
            System.out.println("Insira os valores: ");
            for (int i = 0; i < vect.length; i++) {
                System.out.print("Insira o valor "
                        + i + ": ");
                vect[i] = sc.nextInt();
            }

            int contador = 0;
            System.out.println("Numeros pares: ");
            for (int num : vect) {
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                    contador++;
                }
            }
            System.out.println();
            System.out.printf("QUANTIDADE DE PARES = %d%n", contador);
            System.out.println();
            System.out.println("Gostaria de repetir ? S/N");
            sc.nextLine();
            repetir = sc.nextLine();

        }while ("s".equalsIgnoreCase(repetir));
        System.out.println("Saindo . . .");
        sc.close();
    }
}
