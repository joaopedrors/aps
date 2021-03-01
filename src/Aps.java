


public class Aps {

    public static void main(String[] args) {

        PessoaFisica f1 = new PessoaFisica() {};
        f1.setNome("Joao Pedro");
        String d1 = "14/05/2000";
        f1.setCpf("154.544.412-00");

        /*PESSOA FISICA 02*/
        PessoaFisica f2 = new PessoaFisica();
        f2.setNome("Claudiana Ribeiro");
        f2.setCpf("561.151.455-03");

        /* PESSOA JURIDICA 01*/
        PessoaJuridica j1 = new PessoaJuridica();
        j1.setNome("Neto mg");
        j1.setCnpj("55.456.465/4558-22");
       
        /* PESSOA JURIDICA 02*/
        PessoaJuridica j2 = new PessoaJuridica();
        j2.setNome("Lila dg");
        j2.setCnpj("55.544.486/4633-52");
        ColecaoPessoa.getInstance().inserir(f1);
        ColecaoPessoa.getInstance().inserir(f2);
        ColecaoPessoa.getInstance().inserir(j1);
        ColecaoPessoa.getInstance().inserir(j2);
        ColecaoPessoa.getInstance().pesquisar(j2);
        ColecaoPessoa.getInstance().atualizar(0, j2);
        ColecaoPessoa.getInstance().remover(0);
        ColecaoPessoa.getInstance().removerlast();
        ColecaoPessoa.getInstance().retornarObjeto(0);
        ColecaoPessoa.getInstance().imprimirDadosColecao();
        
    } 
}
