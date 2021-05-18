package Classe;

public class Contato {
    private int codigo;
    private String nome;
    private String numero;
    
    public Contato(String nome2, int codigo2, String numero2) {
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void add(Contato contato) {
    }

    @Override
    public String toString() {
        return "Contato codigo =" + getCodigo() + ", nome =" + getNome() + ", numero =" + getNumero();
    }

    
    
}

