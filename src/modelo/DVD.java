package modelo;

public class DVD {
    private int codigo;
    private int cod_filme;
    private String situacao;
    private double preco;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCod_filme(int cod_filme) {
        this.cod_filme = cod_filme;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setData_compra(String data_compra) {
        this.data_compra = data_compra;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCod_filme() {
        return cod_filme;
    }

    public String getSituacao() {
        return situacao;
    }

    public double getPreco() {
        return preco;
    }

    public String getData_compra() {
        return data_compra;
    }
    private String data_compra;
}
