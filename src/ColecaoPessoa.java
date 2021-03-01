import java.util.LinkedList;


class ColecaoPessoa implements Colecao {
    private Pessoa dados;
    private int posicaoCorrente;
    private final LinkedList list = new LinkedList();
    private static ColecaoPessoa instance = new ColecaoPessoa();
    
    private ColecaoPessoa() {}
    
    private ColecaoPessoa(int posicaoCorrente) {
        this.posicaoCorrente = posicaoCorrente;
    }

    public static ColecaoPessoa getInstance(){
        return instance;
    }
    @Override
    public boolean inserir(Pessoa p) {
        if(list.size()<100){
            list.add(p);
            return true;
        }
        else{
            return false;
        }

    }

    @Override
    public boolean removerlast() {
        if(list.size()>0){
            list.remove();
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean remover(int indice) {
        
         if(list.size()>0){
            list.removeLast();
            return true;
        }
        else{
            System.out.println("Lista vazia!");
            return false;
        }  
    }

    @Override
    public void atualizar(int indice, Pessoa p) {
        if(list.size()>0){
            list.set(indice, p);
        }      
    }

    @Override
    public boolean pesquisar(Pessoa p) {
        if(list.size()>0){
            list.contains​(p);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean colecaoEstaVazia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimirDadosColecao() {
         int x=0;
        do{
            System.out.println("Lista = "+list.get(x));
            x++;
        }while(x!=list.size());
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//    public boolean compararCPf(String cpf, String cpf_1){;
//        if (!PessoaFisica.cpf.equals(this.cpf, other.cpf)) {
//            return false;
//        }
//        return false;
//    }

    @Override
    public Pessoa retornarObjeto(int indice) {
         return (Pessoa) list.get(indice);
    }
    public boolean CompararCPF(){
            int x=0, y;
            while(x!=list.size()){
                y=0;
                while(y!=list.size()){
                    PessoaFisica p = (PessoaFisica) list.get(x);
                    PessoaFisica p1 = (PessoaFisica) list.get(y);

                    if(p.getCpf() == p1.getCpf()){
                        return true;
                    }
                    y++;
                }
                x++;
            }
            return false;
        }
    public Pessoa getDados() {
        return dados;
    }

    public void setDados(Pessoa dados) {
        this.dados = dados;
    }

    public int getPosicaoCorrente() {
        return posicaoCorrente;
    }

    public void setPosicaoCorrente(int posicaoCorrente) {
        this.posicaoCorrente = posicaoCorrente;
    }
}

