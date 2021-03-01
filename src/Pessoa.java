
abstract class Pessoa {
    private String nome;
    
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa() {
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + '}';
    }
    public abstract boolean validarDocumento();
    public abstract int calcularIdade( );

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    
}
