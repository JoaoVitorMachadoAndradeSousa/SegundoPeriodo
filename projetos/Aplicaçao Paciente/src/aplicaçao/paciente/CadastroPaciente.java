
package aplicaçao.paciente;


public class CadastroPaciente {
    private int qtd;
    private final Paciente [] p;
    
    public CadastroPaciente(){
        p = new Paciente [2000];
        
    }
    public void cadastroPaciente (Paciente pa){
        int i;
        int j;
        if(this.qtd == this.p.length){
            System.out.println("Cadastro de pacientes cheio!");
            System.out.println("Cadastramento não efetuado.");
        }else{
            for(i = 0; i < this.qtd ; i++){
                if(this.p[i].compareTo(pa) == 0){
                    System.out.println("Paciente já existente.");
                    System.out.println("Cadastramento não efetuado.");
                    return;
                }else if(this.p[i].compareTo(pa) > 0){
                    break;
                }
                        
            }
            for(j = this.qtd; j > i; j--){
                this.p[j] = this.p[j-1]; 
            }
            this.p[i] = pa;
            this.qtd++;
            System.out.println("Cadastramento do paciente efetuado!");
        }
    }
    private int buscaBinaria (String cpf){
        int inicio = 0;
        int fim = this.qtd -1;
        int meio;
        if(this.qtd == 0){
            return -2;
        }else{
            Paciente pa = new Paciente (cpf, "","","");
            do{
                meio = (inicio + fim) / 2;
                if(pa.compareTo(this.p[meio]) == 0){
                    return meio;
                }else if(pa.compareTo(this.p[meio]) < 0){
                    fim = meio - 1;
                }else{
                    inicio = meio + 1;
                }
            }while(inicio <= fim);
            return -1;
        }
        
    }
    public void exibe1Paciente (String cpf){
        if(buscaBinaria(cpf)== -1){
            System.out.println("Paciente não cadastrado.");
        }
        else if (buscaBinaria(cpf) == -2){
            System.out.println("Cadastramento cheio!!");
        }else{
            System.out.println(this.p[buscaBinaria(cpf)]);
        }
    }
}
