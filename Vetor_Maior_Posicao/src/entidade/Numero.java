package entidade;

public class Numero {

    private double valor;
    int posicao;

    public Numero(double valor, int posicao) {
        this.valor = valor;
        this.posicao = posicao;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }
}
