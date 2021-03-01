
abstract class Pessoa {
    private String nome;
   
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + '}';
    }
    public abstract void validarDocumento(boolean b);
    public abstract void calcularIdade(int a);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
