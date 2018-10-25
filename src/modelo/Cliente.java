package modelo;

public class Cliente {
    
    private int Codigo;
    private String Nome;
    private String  Nascimento;
    private String RG;
    private String CPF;
    private String Telefone;
    private String Email;

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setNascimento(String Nascimento) {
        this.Nascimento = Nascimento;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public int getCodigo() {
        return Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public String getNascimento() {
        return Nascimento;
    }

    public String getRG() {
        return RG;
    }

    public String getCPF() {
        return CPF;
    }

    public String getTelefone() {
        return Telefone;
    }

    public String getEmail() {
        return Email;
    }

    public String getBairro() {
        return Bairro;
    }

    public String getRua() {
        return Rua;
    }

    public int getNumero() {
        return Numero;
    }

    public String getCEP() {
        return CEP;
    }
    private String Bairro;
    private String Rua;
    private int Numero;
    private String CEP;
}
