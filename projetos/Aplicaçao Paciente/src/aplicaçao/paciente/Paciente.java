
package aplicaçao.paciente;


public class Paciente implements Comparable <Paciente>{
    private String cpf;
    private String nome;
    private String email;
    private String fone;
    
      public Paciente (String cpf, String nome, String email, String fone){
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.fone = fone;
        
    }
    private void setCpf (String novoCpf){
        this.cpf = novoCpf;
    }
    private String getCpf (){
        return this.cpf;
    }
    private void setNome (String novoNome){
        this.nome = novoNome;
    }
    private String getNome (){
        return this.nome;
    }
    private void setEmail (String novoEmail){
        this.email = novoEmail;
    }
    private String getEmail (){
        return this.email;
    
}
    private void setFone (String novoFone){
        this.fone = novoFone;
    }
    private String getFone (){
        return this.fone;
    }
    
   public int compareTo (Paciente c){
        return this.getCpf().compareTo(c.getCpf());
    }
    @Override
   public String toString (){
        return "Paciente: "+this.getCpf()+" "+this.getNome()+" "+this.getEmail()+" "+this.getFone();
    }
}
