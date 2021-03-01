
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.TimeUnit;


public class PessoaJuridica extends Pessoa {
    
    private String cnpj;
    private Date dataCriacao;
    
    public PessoaJuridica(){
        
    }
    public PessoaJuridica(String cnpj, Date dataCriacao, String nome) {
        super(nome);
        this.cnpj = cnpj;
        this.dataCriacao = dataCriacao;
    }
    
    
    @Override
    public boolean validarDocumento( ) {
        if(this.cnpj.length() == 18){
            System.out.println("Documento válido"); 
            
            return true;
        }else{          
            System.out.println("Documento inválido");
            return false;
        }    
    }

    @Override
    public int calcularIdade() {
        Date d = new Date();
        long dMil = Math.abs(this.getDataCriacao().getTime() - d.getTime());
        long diff = TimeUnit.DAYS.convert(dMil, TimeUnit.MILLISECONDS);
        int idade =(int) diff/365;
        return idade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.cnpj);
        hash = 97 * hash + Objects.hashCode(this.dataCriacao);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PessoaJuridica other = (PessoaJuridica) obj;
        if (!Objects.equals(this.cnpj, other.cnpj)) {
            return false;
        }
        if (!Objects.equals(this.dataCriacao, other.dataCriacao)) {
            return false;
        }
        return true;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
    
}
