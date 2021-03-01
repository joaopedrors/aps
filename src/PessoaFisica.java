
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.TimeUnit;


public class PessoaFisica extends Pessoa {
    private String cpf;
    private Date dataNascimento;
    LocalDateTime atualDate = LocalDateTime.now();

    public PessoaFisica() {
    }

    public PessoaFisica(String cpf, Date dataNascimento, String nome) {
        super(nome);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

 
    @Override
    public boolean validarDocumento( ) {
        if(this.cpf.length() == 14){
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataCriacao() {
        return dataNascimento;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataNascimento = dataCriacao;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.cpf);
        hash = 71 * hash + Objects.hashCode(this.dataNascimento);
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
        final PessoaFisica other = (PessoaFisica) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.dataNascimento, other.dataNascimento)) {
            return false;
        }
        return true;
    }
    
}
