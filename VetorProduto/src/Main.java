import entidade.Produto;import java.util.Scanner;
import java.util.Locale;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidades de Produtos: "); // pergunta ao usuarios quantos produtos quer criar
        int qtd = sc.nextInt(); // quabtidades de produtos que devem ser criados vai para qtd

       Produto[] matrizProduto = new Produto[qtd]; // vetor criado para objeto produto  que vai criar quantidade solicitado por usuario


        for (int n = 0; n < matrizProduto.length; n++) { // n é variavel de controle, n tem que ser menor q length pois n é = 0, e quantidade de valor é diferente de indice
            System.out.println("Digite o nome do produto: "); // faz o input de nome
            String nome = sc.next();
            System.out.println("Digite o valor do produto: "); // faz o input de valor
            double preco = sc.nextDouble();

            matrizProduto[n] = new Produto(nome, preco); // cria novo produto com os parametros preenchidos com inputs
        }
        for (int i = 0; i < matrizProduto.length; i++) { // for vai mostrando os vetores criados linha por linha usando o for
            System.out.println(matrizProduto[i]);
        }

        double soma = 0.0;
        for (int i = 0; i < matrizProduto.length; i++) {
            soma += matrizProduto[i].getPreco(); // acumula cada preço
        }

        double media = soma / qtd; // faz a media dos preços
        System.out.printf("MEDIA DOS PRECOS = %.2f%n", media);

    }
}
